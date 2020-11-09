package com.xample.UTS_Mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Masukpasien extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masuk_pasien);

        TextView btnregistraspasien = (TextView) findViewById(R.id.btndaftarpasien);

        btnregistraspasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Masukpasien.this, Registrasipasien.class);
                startActivity(intent);
            }
        });

        Button nextbtnmasuk = (Button) findViewById(R.id.btnmasuk);

        nextbtnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Masukpasien.this, Halamanutamapasien.class);
                startActivity(intent);
            }
        });

    }
}
