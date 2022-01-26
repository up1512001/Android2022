package com.example.calculator2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText etNumber1,etNumber2;
    TextView etAnswer;
    Button btnPlus,btnMinus,btnMultiply,btnDivide;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        etAnswer = findViewById(R.id.etAnswer);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2;
                n1 = Integer.parseInt(etNumber1.getText().toString());
                n2 = Integer.parseInt(etNumber2.getText().toString());
                etAnswer.setText("Addition is : "+(n1+n2));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2;
                n1 = Integer.parseInt(etNumber1.getText().toString());
                n2 = Integer.parseInt(etNumber2.getText().toString());
                etAnswer.setText("Subtraction is : "+(n1-n2));
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2;
                n1 = Integer.parseInt(etNumber1.getText().toString());
                n2 = Integer.parseInt(etNumber2.getText().toString());
                etAnswer.setText("Multiplication is : "+(n1*n2));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2;
                n1 = Integer.parseInt(etNumber1.getText().toString());
                n2 = Integer.parseInt(etNumber2.getText().toString());
                etAnswer.setText("Division is : "+((float)n1/(float)n2));
            }
        });



    }
}