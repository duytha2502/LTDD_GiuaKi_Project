package com.example.ltdd_giuaki_project;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btnLogin1 = (Button) findViewById(R.id.btnLogin);
        btnLogin1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent SignInScreen = new Intent(HomeActivity.this, SignInActivity.class);
                startActivity(SignInScreen);
            }
        });
        Button btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUpScreen = new Intent(HomeActivity.this, SignUpActivity.class);
                startActivity(SignUpScreen);
            }
        });

    }
}

