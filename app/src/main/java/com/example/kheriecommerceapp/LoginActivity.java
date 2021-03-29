package com.example.kheriecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
Button signUpActivity,loginBtn;
TextView logoText,sloganText;
TextInputLayout username,password;
ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        image = findViewById(R.id.logoImageLogin);
        logoText = findViewById(R.id.welcome_sloganLogin);
        sloganText =findViewById(R.id.signInSlogan);
        username =findViewById(R.id.usernameLogin);
        password =findViewById(R.id.passwordLogin);
        loginBtn=findViewById(R.id.loginBtn);



        signUpActivity = findViewById(R.id.goToSignUp);
        signUpActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,SignUp.class);
                startActivity(intent);

            }
        });
    }
}