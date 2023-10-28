package com.rohit.aarcart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4_1 extends AppCompatActivity {
    Button exitbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main41);
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
                Intent intent = new Intent(MainActivity4_1.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Button back = (Button)  findViewById(R.id.btnback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4_1.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        Button des = (Button)  findViewById(R.id.btndes);
        des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4_1.this, MainActivity4_1.class);
                startActivity(intent);
            }
        });

        Button spec = (Button)  findViewById(R.id.btnspec);
        spec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4_1.this, MainActivity4_2.class);
                startActivity(intent);
            }
        });

    }
}