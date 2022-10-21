package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication2.helper.helper;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername, txtPassword;
    Button btnLogin;
    TextView txtDaftar;
    String username = "Tyas";
    String password = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        txtDaftar = findViewById(R.id.txtDaftar);


        btnLogin.setOnClickListener(view -> {
            String user = txtUsername.getText().toString();
            String pass = txtPassword.getText().toString();

            if ((user.equals(username)) && (pass.equals(password))) {
                Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
                helper.setUsername(user);
                startActivity(new Intent(this, Dashboard.class));
            } else {
                Toast.makeText(this, "Login Gagal", Toast.LENGTH_SHORT).show();
            }

        });

    }
}

