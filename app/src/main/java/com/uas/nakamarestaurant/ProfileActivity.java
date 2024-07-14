package com.uas.nakamarestaurant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private Button btnEditProfile, btnViewActivity;
    private TextView tvUsername, tvEmail, tvLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Inisialisasi UI elements
//        btnEditProfile = findViewById(R.id.btnEditProfile); // Sesuaikan dengan ID yang benar
//        btnViewActivity = findViewById(R.id.btnViewActivity); // Sesuaikan dengan ID yang benar
        tvUsername = findViewById(R.id.textView5); // Sesuaikan dengan ID yang benar
        tvEmail = findViewById(R.id.textView6); // Sesuaikan dengan ID yang benar
        tvLogout = findViewById(R.id.logout); // Sesuaikan dengan ID yang benar

        // Mengisi data user (ini hanya contoh, sesuaikan dengan data user Anda)
        tvUsername.setText("Olivia");
        tvEmail.setText("oliplachibolala@gmail.com");

        // Set onClickListener untuk tombol Edit Profile
        btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi untuk mengedit profil
                Intent intent = new Intent(ProfileActivity.this, EditProfileActivity.class);
                startActivity(intent);
            }
        });

        // Set onClickListener untuk tombol View Activity
        btnViewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi untuk melihat aktivitas
                Intent intent = new Intent(ProfileActivity.this, ActivityHistoryActivity.class);
                startActivity(intent);
            }
        });

        // Set onClickListener untuk tombol Logout
        tvLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi untuk logout
                performLogout();
            }
        });
    }

    private void performLogout() {
        // Aksi untuk logout
        // Misalnya, kembali ke halaman login setelah logout
        Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish(); // Menutup activity profil setelah logout
    }

}
