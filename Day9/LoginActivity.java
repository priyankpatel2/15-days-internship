package com.example.day9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class LoginActivity extends AppCompatActivity {
    EditText  etEmail, etPassword;
    Button btnLogin,btnSignup;

    public static final String main_key="my_pref";
    public static final String name_key="namekey";
    public static final String email_key="emailkey";
    public static final String password_key="passwordkey";
    public static final String contact_key="contactkey";
    private android.view.View.OnClickListener View;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etEmail =findViewById(R.id.etEmail);
        btnLogin =findViewById(R.id.btnLogin);
        etPassword =findViewById(R.id.etPassword);
        btnSignup =findViewById(R.id.btnSignup);
        btnLogin.setOnClickListener((View V) ->{

            SharedPreferences preferences = getSharedPreferences(main_key, MODE_PRIVATE);

            String userName1 =preferences.getString(name_key,"");
            String userEmail1 =preferences.getString(email_key,"");
            String userPassword1 =preferences.getString(password_key,"");
            String userMobile1 =preferences.getString(contact_key,"");

            if (userEmail1.equals(userEmail1)&& userPassword1.equals(userPassword1)){
                Intent intent = new Intent(LoginActivity.this,DisplayActivity.class);

                intent.putExtra("NAME", userName1);
                intent.putExtra("EMAIL", userEmail1);
                boolean userPhone1 = false;
                intent.putExtra("Contact", userPhone1);
                startActivity(intent);
                finish();
            }
            else {
                Toast.makeText(LoginActivity.this, "Invalid Login Details", Toast.LENGTH_SHORT).show();
            }
        });
        btnSignup.setOnClickListener((View V)->{
            Intent intent = new Intent(LoginActivity.this,RegistrationActivity.class);
            startActivity(intent);
        });
    }
}