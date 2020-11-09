package com.xample.UTS_Mobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class Masukdokter extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masuk_dokter);

        Button nextbtnmasuk = (Button) findViewById(R.id.btnmasuk);

        nextbtnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Masukdokter.this, Halamanutamadokter.class);
                startActivity(intent);
            }
        });
    }
}
