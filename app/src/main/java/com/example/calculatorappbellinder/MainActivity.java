package com.example.calculatorappbellinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void addNums(View v){
        EditText n1 = findViewById(R.id.Number1);
        EditText n2 = findViewById(R.id.Number2);
        EditText n3 = findViewById(R.id.Number3);

        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int num3 = num1 + num2;

        n3.setText("  " + num3);


    }

    public void subNums(View v){
        EditText n1 = findViewById(R.id.Number1);
        EditText n2 = findViewById(R.id.Number2);
        EditText n3 = findViewById(R.id.Number3);

        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int num3 = num1 - num2;

        n3.setText(" " + num3);


    }

    public void muliplyNums(View v){
        EditText n1 = findViewById(R.id.Number1);
        EditText n2 = findViewById(R.id.Number2);
        EditText n3 = findViewById(R.id.Number3);

        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int num3 = num1 * num2;

        n3.setText(" " + num3);


    }

    public void divideNums(View v){
        EditText n1 = findViewById(R.id.Number1);
        EditText n2 = findViewById(R.id.Number2);
        EditText n3 = findViewById(R.id.Number3);

        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int num3 = num1 / num2;

        n3.setText(" " + num3);


    }
}