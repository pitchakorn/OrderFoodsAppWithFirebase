package com.example.topnt.firebasetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Cardview_chicken extends AppCompatActivity implements View.OnClickListener{

    private CardView Roasted,Curry,Rendang,Herbal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview_chicken);

        //defining Cards
        Roasted = (CardView) findViewById(R.id.card_chicken_roasted);
        Curry = (CardView) findViewById(R.id.card_chicken_curry);
        Rendang = (CardView) findViewById(R.id.card_chicken_rendang);
        Herbal = (CardView) findViewById(R.id.card_chicken_herbal);

        //Add Click listener to the cards
        Roasted.setOnClickListener(this);
        Curry.setOnClickListener(this);
        Rendang.setOnClickListener(this);
        Herbal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent select;

        switch (v.getId()) {
            case R.id.card_chicken_roasted :
                select = new Intent(this,Detail_chicken_roasted.class);  startActivity(select);  break;
            case R.id.card_chicken_curry :
                select = new Intent(this,Detail_chicken_curry.class);  startActivity(select);  break;
            case R.id.card_chicken_rendang :
                select = new Intent(this,Detail_chicken_rendang.class);  startActivity(select);  break;
            case R.id.card_chicken_herbal :
                select = new Intent(this,Detail_chicken_herball.class);  startActivity(select);  break;

            default:break;
        }

    }
}
