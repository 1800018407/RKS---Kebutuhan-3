package com.example.praktikum8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class maps extends AppCompatActivity {
    EditText tempat;
    Button btnmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);


        tempat = findViewById(R.id.tempat);
        btnmap = findViewById(R.id.btnmap);

        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com/maps/search/"+tempat.getText().toString()));
                startActivity(intent);
            }
        });
    }
}