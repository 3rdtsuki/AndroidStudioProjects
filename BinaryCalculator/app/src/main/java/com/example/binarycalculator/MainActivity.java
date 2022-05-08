package com.example.binarycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView inputText=findViewById(R.id.inputText);
        Button binButton=findViewById(R.id.button);
        Button hexButton=findViewById(R.id.button2);
        TextView resultText=findViewById(R.id.resultText);

        binButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=Integer.parseInt(inputText.getText().toString());
                String res=Integer.toBinaryString(num);
                resultText.setText(res);
            }
        });
        hexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=Integer.parseInt(inputText.getText().toString());
                String res=Integer.toHexString(num);
                resultText.setText(res);
            }
        });
    }
}