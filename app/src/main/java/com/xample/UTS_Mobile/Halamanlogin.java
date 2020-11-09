package com.xample.UTS_Mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Halamanlogin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamanlogin);

        Button nextbtnpasien = (Button) findViewById(R.id.btnmasukpasien);

        nextbtnpasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Halamanlogin.this, Masukpasien.class);
                startActivity(intent);
            }
        });

        Button nextbtndokter = (Button) findViewById(R.id.btnmasukdokter);

        nextbtndokter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Halamanlogin.this, Masukdokter.class);
                startActivity(intent);
            }
        });

        Button nextregistrasi = (Button) findViewById(R.id.btndaftar);

        nextregistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Halamanlogin.this, Registrasipasien.class);
                startActivity(intent);
            }
        });

    }
}
