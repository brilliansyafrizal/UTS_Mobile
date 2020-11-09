package com.xample.UTS_Mobile;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registrasipasien extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrasipasien);

        Button signupBtn = (Button) findViewById(R.id.create);

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    public void showDialog(){
        android.app.AlertDialog.Builder alertDialogBuilder = new android.app.AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("RS Dr Soetomo");
        alertDialogBuilder.setMessage("Data yang anda masukkan benar dan dapat dipertanggung jawabkan? Jika belum yakin silahkan cek kembali. ");
        alertDialogBuilder.setIcon(R.drawable._6__rsud_dr_soetomo);
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Simpan", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText( Registrasipasien.this, "Data Telah Tersimpan, silahkan login", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Registrasipasien.this, Halamanlogin.class);
                startActivity(intent);
            }
        });
        alertDialogBuilder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        android.app.AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

}
