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
        EditText num1 = findViewById(R.id.Number1);
        EditText num2 = findViewById(R.id.Number2);
        EditText num3 = findViewById(R.id.Number3);


    }
}