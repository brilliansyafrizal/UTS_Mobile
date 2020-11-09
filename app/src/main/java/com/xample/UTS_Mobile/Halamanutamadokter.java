package com.xample.UTS_Mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Halamanutamadokter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamanutamadokter);

        LinearLayout btnjanjidokter = (LinearLayout) findViewById(R.id.janjidokter);

        btnjanjidokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Halamanutamadokter.this, Notification_dokter.class);
                startActivity(intent);
            }
        });

        LinearLayout btnrekappasien = (LinearLayout) findViewById(R.id.rekappasien);

        btnrekappasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Halamanutamadokter.this, Rekappasien.class);
                startActivity(intent);
            }
        });

    }
}
