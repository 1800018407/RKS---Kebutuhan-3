package com.example.praktikum8;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class antrian extends AppCompatActivity {

    int count = 0;
    private Button btnin, btnback;
    private TextView btnno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antrian);

        btnin = findViewById(R.id.btnantrian);
        btnno = findViewById(R.id.btnnomer);
        btnback = findViewById(R.id.back);

        btnin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                btnno.setText("A" + count);
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(antrian.this);
                builder.setMessage("Nomor antrian sudah terdaftar. Apakah anda yakin ingin keluar dari halaman ini ?")
                .setPositiveButton("Iya", null).create().show();
            }
        });
    }
}