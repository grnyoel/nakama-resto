package com.uas.nakamarestaurant;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // Memanfaatkan library EdgeToEdge untuk menangani edge-to-edge (bawaan Android 12)
        setContentView(R.layout.activity_register); // Mengatur layout activity_register.xml sebagai layout aktif
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.actRegister), (v, insets) -> { // Mengatur padding berdasarkan inset sistem
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
