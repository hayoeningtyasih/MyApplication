package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication2.helper.helper;

public class Dashboard extends AppCompatActivity {

    TextView txtUsername;
    ImageView txtgambar1;
    ImageView txtgambar2;
    ImageView txtgambar3;
    ImageView txtgambar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        txtgambar1 = findViewById(R.id.txtgambar1);
        txtUsername = findViewById(R.id.txtUsername);
        txtgambar2 = findViewById(R.id.txtgambar2);
        txtgambar3 = findViewById(R.id.txtgambar3);
        txtgambar4 = findViewById(R.id.txtgambar4);
        txtUsername.setText(helper.getUsername());


            txtgambar1.setOnClickListener(view -> {
                startActivity(new Intent(this, MainActivity2.class));
            });

        };

    }


