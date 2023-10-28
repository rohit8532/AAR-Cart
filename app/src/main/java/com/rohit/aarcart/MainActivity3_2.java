package com.rohit.aarcart;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3_2 extends AppCompatActivity {
    Button exitbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main32);
        Button exit = (Button) findViewById(R.id.btnexit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });

        Button home = (Button) findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3_2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button back = (Button)  findViewById(R.id.btnback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3_2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        Button des = (Button)  findViewById(R.id.btndes);
        des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3_2.this, MainActivity3_1.class);
                startActivity(intent);
            }
        });

        Button spec = (Button)  findViewById(R.id.btnspec);
        spec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3_2.this, MainActivity3_2.class);
                startActivity(intent);
            }
        });

    }
}