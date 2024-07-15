package com.uas.nakamarestaurant;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private Button btnEditProfile, btnViewActivity;
    private TextView tvUsername, tvEmail, tvLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

//        btnEditProfile = findViewById(R.id.btnEditProfile);
//        btnViewActivity = findViewById(R.id.btnViewActivity);
        tvUsername = findViewById(R.id.textView5);
        tvEmail = findViewById(R.id.textView6);
        tvLogout = findViewById(R.id.logout);

        tvUsername.setText("Olivia");
        tvEmail.setText("oliplachibolala@gmail.com");

        btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi untuk mengedit profil
                Intent intent = new Intent(ProfileActivity.this, EditProfileActivity.class);
                startActivity(intent);
            }
        });

        // Set onClickListener untuk tombol View Activity
//        btnViewActivity.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Aksi untuk melihat aktivitas
//                Intent intent = new Intent(ProfileActivity.this, ActivityHistoryActivity.class);
//                startActivity(intent);
//            }
//        });

        // Set onClickListener untuk tombol Logout
        tvLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLogoutDialog();
            }
        });
    }

    private void showLogoutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Logout");
        builder.setMessage("Are you sure you want to logout?");
        builder.setPositiveButton("Logout", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                performLogout();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // User memilih untuk membatalkan logout
                dialog.dismiss();
            }
        });
        builder.show();
    }

    private void performLogout() {
        // Aksi untuk logout
        Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish(); // Menutup activity profil setelah logout
    }

}
