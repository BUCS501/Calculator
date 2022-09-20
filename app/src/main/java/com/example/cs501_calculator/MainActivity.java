package com.example.cs501_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvAnswer;
    private TextView tvEquation;
    private Button num0;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button Dec;
    private Button Add;
    private Button Sub;
    private Button Mul;
    private Button Div;
    private Button Sqrt;
    private Button eq;
    private String screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvEquation = (TextView) findViewById(R.id.tvEquation);
        tvAnswer = (TextView) findViewById(R.id.tvAnswer);
        num0 = (Button) findViewById(R.id.num0);
        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);
        Dec = (Button) findViewById(R.id.Dec);
        Add = (Button) findViewById(R.id.Add);
        Sub = (Button) findViewById(R.id.Sub);
        Mul = (Button) findViewById(R.id.Mul);
        Div = (Button) findViewById(R.id.Div);
        Sqrt = (Button) findViewById(R.id.Sqrt);
        eq = (Button) findViewById(R.id.eq);
        screen = "";

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + num0.getText().toString();
                tvEquation.setText(screen);
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + num1.getText().toString();
                tvEquation.setText(screen);
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + num2.getText().toString();
                tvEquation.setText(screen);
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + num3.getText().toString();
                tvEquation.setText(screen);
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + num4.getText().toString();
                tvEquation.setText(screen);
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + num5.getText().toString();
                tvEquation.setText(screen);
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + num6.getText().toString();
                tvEquation.setText(screen);
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + num7.getText().toString();
                tvEquation.setText(screen);
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + num8.getText().toString();
                tvEquation.setText(screen);
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + num9.getText().toString();
                tvEquation.setText(screen);
            }
        });

        Dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + Dec.getText().toString();
                tvEquation.setText(screen);
            }
        });

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + Add.getText().toString();
                tvEquation.setText(screen);
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + Sub.getText().toString();
                tvEquation.setText(screen);
            }
        });

        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + Mul.getText().toString();
                tvEquation.setText(screen);
            }
        });

        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + Div.getText().toString();
                tvEquation.setText(screen);
            }
        });

        Sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen = screen + Sqrt.getText().toString();
                tvEquation.setText(screen);
            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen == "") {
                    Toast.makeText(MainActivity.this, "Please enter proper equation to evaluate", Toast.LENGTH_SHORT).show();
                }
                String input = screen;
                if (screen.endsWith("+") || screen.endsWith("-") || screen.endsWith("*") || screen.endsWith("/") || screen.endsWith("sqrt")){

                    Toast.makeText(MainActivity.this, "Please enter proper equation to evaluate", Toast.LENGTH_SHORT).show();

                }

                Double answer = Calculate.eval(screen);
                screen = "";
                tvEquation.setText(screen);
                tvAnswer.setText(answer.toString());

            }
        });

    }
}