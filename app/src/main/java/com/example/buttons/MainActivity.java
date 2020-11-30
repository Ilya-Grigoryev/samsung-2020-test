package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text;
    Button sum;
    EditText ed1, ed2, ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = findViewById(R.id.summ);
        text = findViewById(R.id.answer);
        ed1 = findViewById(R.id.num1);
        ed2 = findViewById(R.id.num2);
        ed3 = findViewById(R.id.num3);
        sum.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String t1 = ed1.getText().toString();
        String t2 = ed2.getText().toString();
        String t3 = ed3.getText().toString();
        double a = Integer.parseInt(t1);
        double b = Integer.parseInt(t2);
        double c = Integer.parseInt(t3);
        double D = b*b - 4*a*c;
        if (a == 0) {
            text.setText(String.valueOf("Ошибка"));
        }
        else if (D < 0) {
            text.setText(String.valueOf("Нет корней"));
        }
        else if (D == 0) {
            double x = -b / (2 * a);
            text.setText(String.valueOf(x));
        }
        else {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            text.setText(String.valueOf(x1 + "  " + x2));
        }
    }
}