package com.example.gocorona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class precautions extends AppCompatActivity {

    private Button bt1,bt2,bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precautions);

        bt1 = (Button) findViewById(R.id.button2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        bt2 = (Button) findViewById(R.id.button3);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        bt3 = (Button) findViewById(R.id.button4);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });

    }

    public void openActivity2() {
        Intent intent = new Intent(this, symptoms.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent = new Intent(this, what.class);
        startActivity(intent);
    }
    public void openActivity4() {
        Intent intent = new Intent(this, help1.class);
        startActivity(intent);
    }
}
