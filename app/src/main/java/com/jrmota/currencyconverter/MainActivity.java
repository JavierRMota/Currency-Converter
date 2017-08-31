package com.jrmota.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void convertToPesos(View v)
    {
        EditText dollars = (EditText) findViewById(R.id.dollarET);
        TextView pesos = (TextView) findViewById(R.id.amountText);
        double money = Double.parseDouble(dollars.getText().toString()) *18.42;
        String moneyS = String.format("$ %.2f ",money);
        pesos.setText(moneyS);
        Toast.makeText(this, moneyS, Toast.LENGTH_SHORT).show();
    }
}
