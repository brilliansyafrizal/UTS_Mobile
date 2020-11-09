package com.xample.UTS_Mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Antrpasien extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.antri_pasien);
    }
    public void pindah(View view) {
        Intent intent = new Intent(Antrpasien.this, Dokter.class);
        startActivity(intent);
    }
}
