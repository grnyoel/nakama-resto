package com.uas.nakamarestaurant;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditProfileActivity extends AppCompatActivity {

    private EditText etUsername, etEmail;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        etUsername = findViewById(R.id.etUsername);
        etEmail = findViewById(R.id.etEmail);
        btnSave = findViewById(R.id.btnSave);

        // Mengisi data user (ini hanya contoh, sesuaikan dengan data user Anda)
        etUsername.setText("John Doe");
        etEmail.setText("john.doe@example.com");

        btnSave.setOnClickListener(v -> {
            // Aksi untuk menyimpan perubahan profil
            String username = etUsername.getText().toString().trim();
            String email = etEmail.getText().toString().trim();

            // Validasi dan penyimpanan data bisa ditambahkan di sini

            Toast.makeText(EditProfileActivity.this, "Profile Updated", Toast.LENGTH_SHORT).show();
        });
    }
}
