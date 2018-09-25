package com.example.rishabravikumar.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tipAmountTextView = (TextView) findViewById(R.id.tipAmount);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText totalAmount = (EditText) findViewById(R.id.tipEnter);
        final EditText tipPercentage = (EditText) findViewById(R.id.tipPercentage);
        Button calculateButton = (Button) findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double total = Double.parseDouble(totalAmount.getText().toString());
                Double percent = Double.parseDouble(tipPercentage.getText().toString());

                Double tipAmount = total * (percent/100);

                tipAmountTextView.setText("Tip Amount: "+Double.toString(tipAmount));
            }
        });
    }
}
