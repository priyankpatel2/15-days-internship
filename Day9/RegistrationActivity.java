package com.example.day9;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    EditText etName, etEmail, etPassword, etMobile;
    Button btnRegister;

    public static final String main_key="my_pref";
    public static final String name_key="namekey";
    public static final String email_key="emailkey";
    public static final String password_key="passwordkey";
    public static final String contact_key="contactkey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        etName = findViewById(R.id.etName);
        etEmail =findViewById(R.id.etEmail);
        etMobile =findViewById(R.id.etMobile);
        etPassword =findViewById(R.id.etPassword);
        btnRegister =findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener((View V) ->{
            SharedPreferences preferences = getSharedPreferences(main_key,MODE_PRIVATE);

            String userName =etName.getText().toString();
            String userEmail =etEmail.getText().toString();
            String userPassword =etPassword.getText().toString();
            String userMobile =etMobile.getText().toString();

            SharedPreferences.Editor editor = preferences.edit();

            editor.putString(name_key, userName);
            editor.putString(email_key, userEmail);
            editor.putString(password_key, userPassword);
            editor.putString(contact_key, userMobile);

            editor.apply();

            Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
            startActivity(intent);

        });
    }
}