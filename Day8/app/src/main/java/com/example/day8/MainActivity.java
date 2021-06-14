package com.example.day8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView lvname;
    int[] image = {R.drawable.c,R.drawable.dart,R.drawable.flutter,R.drawable.java,R.drawable.kotlin,R.drawable.php,R.drawable.python} ;
    String[] name = {"This is C/C++","This is Dart","This is Flutter","This is Java","This is Kotlin","This is PHP","This is Python"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvname=findViewById(R.id.lvName);

        Myadapter myadapter = new Myadapter(image,name,MainActivity.this);

        lvname.setAdapter(myadapter);

        lvname.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,ListDataActivity.class);
                intent.putExtra("I1",image[position]);
                intent.putExtra("T1",name[position]);
                startActivity(intent);

            }
        });

    }
}