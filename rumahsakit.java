package com.example.praktikum8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rumahsakit extends AppCompatActivity {
    Button rs1, rs2, rs3, rs4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumahsakit);

        rs1 = findViewById(R.id.maps);
        rs2 = findViewById(R.id.ptau);
        rs3 = findViewById(R.id.rsud);
        rs4 = findViewById(R.id.rsi);

        rs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rumahsakit.this, dokter.class);
                startActivity(intent);
            }
        });

        rs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(rumahsakit.this, dokter.class);
                startActivity(i);
            }
        });

        rs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(rumahsakit.this, dokter.class);
                startActivity(in);
            }
        });

        rs4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(rumahsakit.this, dokter.class);
                startActivity(inte);
            }
        });
    }
}