package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView tvUsername, tvEmail, tvPassword, tvPhone, tvGender, tvHobbies;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        setContentView(R.layout.activity_display);
        tvUsername = findViewById(R.id.tvUserName);
        tvEmail = findViewById(R.id.tvEmail);
        tvPassword = findViewById(R.id.tvPassword);
        tvPhone = findViewById(R.id.tvPhone);
        tvGender = findViewById(R.id.tvGender);
        tvHobbies = findViewById(R.id.tvHobbies);
        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");
        String email = intent.getStringExtra("EMAIL");
        String password = intent.getStringExtra("PASSWORD");
        String phone = intent.getStringExtra("PHONE");
        String gender = intent.getStringExtra("GENDER");
        String hobbies = intent.getStringExtra("HOBBIES");
        tvUsername.setText("Username: " +username);
        tvEmail.setText("Email: " +email);
        tvPassword.setText("Password: " +password);
        tvPhone.setText("Phone: " +phone);
        tvGender.setText("Gender: " +gender);
        tvHobbies.setText("Hobbies: " +hobbies);
    }
}