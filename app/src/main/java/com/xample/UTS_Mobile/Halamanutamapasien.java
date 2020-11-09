package com.xample.UTS_Mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Halamanutamapasien extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamanutamapasien);

        ImageView btnantridokter = (ImageView) findViewById(R.id.antridokter);
        btnantridokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Halamanutamapasien.this, Antrpasien.class);
                startActivity(intent);
            }
        });

        ImageView btnnotif = (ImageView) findViewById(R.id.notificationdokter);
        btnnotif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Halamanutamapasien.this, Notification_pasien.class);
                startActivity(intent);
            }
        });
    }
}
