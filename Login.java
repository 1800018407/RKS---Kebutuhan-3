package com.example.praktikum8;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    EditText user, pass;
    String password = " ";
    Button login, reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText)findViewById(R.id.username);
        pass = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.btnlogin);
        reset = (Button)findViewById(R.id.btnreset);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = user.getText().toString();
                String passwordKey = pass.getText().toString();

                if (usernameKey.equals("tiaiklima") && passwordKey.equals("1800018407")){
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    Login.this.startActivity(intent);
                    finish();
                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setMessage("Username atau Password Anda salah!")
                            .setNegativeButton("Retry", null).create().show();
                }
            }
        });
    }
}