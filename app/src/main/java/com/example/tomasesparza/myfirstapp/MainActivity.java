package com.example.tomasesparza.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView totalTextView;
    EditText percentageText;
    EditText numberText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        totalTextView = (TextView) findViewById(R.id.totalTextView);
        percentageText = (EditText) findViewById(R.id.percentageText);
        numberText = (EditText) findViewById(R.id.numberText);


        Button calcBtn = (Button)findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float percentage = Float.parseFloat(percentageText.getText().toString());
                float dec = percentage / 100;
                float total = dec * Float.parseFloat(numberText.getText().toString());

                totalTextView.setText(Float.toString(total));

            }
        });

    }
}
