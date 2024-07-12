package com.uas.nakamarestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private Button btnEditProfile, btnViewActivity;
    private TextView tvUsername, tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnEditProfile = findViewById(R.id.btnEditProfile);
        btnViewActivity = findViewById(R.id.btnViewActivity);
        tvUsername = findViewById(R.id.tvUsername);
        tvEmail = findViewById(R.id.tvEmail);

        // Mengisi data user (ini hanya contoh, sesuaikan dengan data user Anda)
        tvUsername.setText("John Doe");
        tvEmail.setText("john.doe@example.com");

        btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi untuk mengedit profil
                Intent intent = new Intent(ProfileActivity.this, EditProfileActivity.class);
                startActivity(intent);
            }
        });

        btnViewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi untuk melihat aktivitas
                Intent intent = new Intent(ProfileActivity.this, ActivityHistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}
