package com.example.praktikum8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dokter extends AppCompatActivity {
    Button dr1, dr2, dr3, dr4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dokter);

        dr1 = findViewById(R.id.droo);
        dr2 = findViewById(R.id.drbambang);
        dr3 = findViewById(R.id.drtia);
        dr4 = findViewById(R.id.drwiwik);

        dr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dokter.this, antrian.class);
                startActivity(intent);
            }
        });

        dr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(dokter.this, antrian.class);
                startActivity(in);
            }
        });

        dr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(dokter.this, antrian.class);
                startActivity(inte);
            }
        });

        dr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dokter.this, antrian.class);
                startActivity(i);
            }
        });
    }
}