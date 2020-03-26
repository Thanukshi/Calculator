package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView ans;
    double answer;

    Button plus, sub, multi, div;
    String x,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = findViewById(R.id.ET1_Second);
        num2 = findViewById(R.id.ET2_Second);
        ans = findViewById(R.id.TV3_Second);
        plus = findViewById(R.id.btn1_Second);
        sub = findViewById(R.id.btn2_Second);
        multi = findViewById(R.id.btn3_Second);
        div = findViewById(R.id.btn4_Second);

        Intent recieveIntent = getIntent();

        x = recieveIntent.getStringExtra("number1");
        y = recieveIntent.getStringExtra("number2");

        num1.setText(x);
        num2.setText(y);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Double.parseDouble(x) + Double.parseDouble(y);
                ans.setText(Double.toString(answer));

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Double.parseDouble(x) - Double.parseDouble(y);
                ans.setText(Double.toString(answer));

            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Double.parseDouble(x) * Double.parseDouble(y);
                ans.setText(Double.toString(answer));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Double.parseDouble(x) / Double.parseDouble(y);
                ans.setText(Double.toString(answer));

            }
        });

    }
}
