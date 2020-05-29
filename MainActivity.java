package com.example.gocorona;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button) findViewById(R.id.b1);
        bt2 = (Button) findViewById(R.id.b2);
        bt3 = (Button) findViewById(R.id.b3);
        bt4 = (Button) findViewById(R.id.b4);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, symptoms.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent = new Intent(this, precautions.class);
        startActivity(intent);
    }
    public void openActivity4() {
        Intent intent = new Intent(this, what.class);
        startActivity(intent);
    }
    public void openActivity5() {
        Intent intent = new Intent(this, help1.class);
        startActivity(intent);
    }
}