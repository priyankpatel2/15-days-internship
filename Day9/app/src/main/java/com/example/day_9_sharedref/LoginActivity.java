package com.example.day_9_sharedref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etName, etEmail, etPassword, etMobile;
    Button btnSignup, btnLogin;
    public static  final String main_key="my_pref";
    public static  final String name_key="nameKey";
    public static  final String email_key="emailKey";
    public static  final String password_key="passwordKey";
    public static  final String contact_key="contactkey";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etMobile = findViewById(R.id.etMobile);
        etPassword = findViewById(R.id.etPassword);
        btnSignup = findViewById(R.id.btnRegister);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener((View v) -> {
            String userEmail = etEmail.getText().toString();
            String userPassword = etPassword.getText().toString();
            SharedPreferences preferences = getSharedPreferences(main_key, MODE_PRIVATE);

            String username1 = preferences.getString(name_key,"");
            String userEmail1 = preferences.getString(email_key,"");
            String userPassword1 = preferences.getString(password_key,"");
            String userMobile1 = preferences.getString(contact_key,"");

            if(userEmail.equals(userEmail1) && userPassword.equals(userPassword1)){
                Intent intent = new Intent(LoginActivity.this, DisplayActivity.class);
                intent.putExtra("NAME", username1);
                intent.putExtra("EMAIL", userEmail1);
                intent.putExtra("Contact", userMobile1);
                startActivity(intent);
                finish();

            }
            else {
                Toast.makeText(LoginActivity.this, "Invalid Login Details", Toast.LENGTH_SHORT).show();

            }
        });
        btnSignup.setOnClickListener((View v)->{
         Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
         startActivity(intent);
        });

    }
}