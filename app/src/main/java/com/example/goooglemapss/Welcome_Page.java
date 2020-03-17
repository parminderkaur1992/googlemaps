package com.example.goooglemapss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome_Page extends AppCompatActivity implements View.OnClickListener{

    Button buy,sell,rent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome__page);

        buy = findViewById(R.id.buy);
        sell = findViewById(R.id.sell);


        sell.setOnClickListener(this);
        buy.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        if(v==buy)
        {
            Intent i = new Intent(getApplicationContext(),buy_property.class);
            startActivity(i);
        }
        if(v==sell) {
            Intent i = new Intent(getApplicationContext(), Sell_Property.class);
            startActivity(i);
        }
    }
}

