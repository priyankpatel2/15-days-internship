package com.example.day5;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    String Colector="";
    EditText etUsername, etEmail, etPhone, etPassword;
    RadioButton radioMale, radioFemale;
    Button btnClick;
    CheckBox cb1,cb2,cb3,cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = findViewById(R.id.etUsername);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etPassword = findViewById(R.id.etPassword);
        radioFemale = findViewById(R.id.radioFemale);
        radioMale = findViewById(R.id.radioMale);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        btnClick = findViewById(R.id.btnClick);

        btnClick.setOnClickListener((View v) -> {
            String username = etUsername.getText().toString();
            String email = etEmail.getText().toString();
            String phone = etPhone.getText().toString();
            String password = etPassword.getText().toString();
            StringBuilder result = new StringBuilder();

            if (radioMale.isChecked()) {
                result.append("Male");
            }
            if (radioFemale.isChecked()) {
                result.append("Female");
            }
            String r1 = result.toString();
            if (cb1.isChecked()) {
                Colector += "chess" + "\n";
                if (cb1.isChecked()) {
                    Colector += "cricket" + "\n";
                    if (cb1.isChecked()) {
                        Colector += "football" + "\n";
                        if (cb1.isChecked()) {
                            Colector += "hockey" + "\n";
                        }

                    }

                }
            }
            Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
            intent.putExtra("USERNAME", username);
            intent.putExtra("EMAIL", email);
            intent.putExtra("PASSWORD", password);
            intent.putExtra("PHONE", phone);
            intent.putExtra("GENDER", r1);
            intent.putExtra("Hobbies",Colector);
            startActivity(intent);

        });
    }
}