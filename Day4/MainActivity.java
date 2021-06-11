package com.example.mycalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etNum1,etNum2;
    TextView tvAns;
    Button btnSubmit,btnSubmit2,btnSubmit3,btnSubmit4,btnSubmit5;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1=findViewById(R.id.etNum1);
        etNum2=findViewById(R.id.etNum2);
        tvAns=findViewById(R.id.tvAns);
        btnSubmit=findViewById(R.id.btnSubmit);
        btnSubmit2=findViewById(R.id.btnSubmit2);
        btnSubmit3=findViewById(R.id.btnSubmit3);
        btnSubmit4=findViewById(R.id.btnSubmit4);
        btnSubmit5=findViewById(R.id.btnSubmit5);


        btnSubmit.setOnClickListener(v -> {
            String n1,n2;
            n1=etNum1.getText().toString();
            n2=etNum2.getText().toString();

            int num1,num2,sum;
            num1=Integer.parseInt(n1);
            num2=Integer.parseInt(n2);
            sum=num1+num2;
            tvAns.setText("Your Ans is =" + sum);
        });

        btnSubmit2.setOnClickListener(v -> {
            String n1,n2;
            n1=etNum1.getText().toString();
            n2=etNum2.getText().toString();

            int num1,num2,sum;
            num1=Integer.parseInt(n1);
            num2=Integer.parseInt(n2);
            sum=num1-num2;
            tvAns.setText("Your Ans is =" + sum);
        });

        btnSubmit3.setOnClickListener(v -> {
            String n1,n2;
            n1=etNum1.getText().toString();
            n2=etNum2.getText().toString();

            int num1,num2,sum;
            num1=Integer.parseInt(n1);
            num2=Integer.parseInt(n2);
            sum=num1*num2;
            tvAns.setText("Your Ans is =" + sum);
        });

        btnSubmit4.setOnClickListener(v -> {
            String n1,n2;
            n1=etNum1.getText().toString();
            n2=etNum2.getText().toString();

            int num1,num2,sum;
            num1=Integer.parseInt(n1);
            num2=Integer.parseInt(n2);
            sum=num1/num2;
            tvAns.setText("Your Ans is =" + sum);
        });
        btnSubmit5.setOnClickListener(v -> {
            String n1,n2;
            n1=etNum1.getText().toString();
            n2=etNum2.getText().toString();

            int num1,num2,sum1,sum2,sum3,sum4;
            num1=Integer.parseInt(n1);
            num2=Integer.parseInt(n2);
            sum1=num1+num2;
            sum2=num1-num2;
            sum3=num1*num2;
            sum4=num1/num2;
            tvAns.setText( "Addition =" + sum1 + "\nSubtraction =" + sum2 + "\nMultiplication =" +sum3 + "\nDivision =" +sum4);
        });
    }
}