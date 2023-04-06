package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText first;
    private EditText second;
    private Button button;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first= (EditText) findViewById(R.id.firstNum);
        second=(EditText) findViewById(R.id.secondNum);
        button= (Button) findViewById(R.id.button);
        result= (TextView) findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstNumber=Double.parseDouble(first.getText().toString());
                double secondNumber=Double.parseDouble(second.getText().toString());
                double res=firstNumber+secondNumber;
                result.setText(""+res);
            }
        });

    }
}