package com.uas.nakamarestaurant;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityHistoryActivity extends AppCompatActivity {

    private TextView tvActivityHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        tvActivityHistory = findViewById(R.id.tvActivityHistory);

        // Contoh data aktivitas, sesuaikan dengan data yang sesungguhnya
        String activityData = "Running: 5km\n" +
                "Cycling: 10km\n" +
                "Swimming: 2km\n";

        tvActivityHistory.setText(activityData);
    }
}
