package com.example.day9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView tvName, tvEmail, tvContact;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
        tvContact = findViewById(R.id.tvContact);
        btnLogout = findViewById(R.id.btnLogout);

        Intent intent = getIntent();
        String name=intent.getStringExtra("NAME");
        String email=intent.getStringExtra("EMAIL");
        String contact=intent.getStringExtra("Contact");
        tvName.setText("Name:"+name);
        tvEmail.setText("Email"+email);
        tvContact.setText("Contact"+contact);

        btnLogout.setOnClickListener(View ->{
            Intent intent1 = new Intent(DisplayActivity.this, LoginActivity.class);
            startActivity(intent1);
            finish();
        });

    }
}