package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText loginText,passwordText;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginText = (EditText)  findViewById(R.id.login);
        passwordText = (EditText)  findViewById(R.id.password);

        btnLogin = (Button) findViewById(R.id.buttonlogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = loginText.getText().toString();
                String password = passwordText.getText().toString();


            }
        });



    }
}