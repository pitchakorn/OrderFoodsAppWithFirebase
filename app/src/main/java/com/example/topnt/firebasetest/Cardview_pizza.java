package com.example.topnt.firebasetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Cardview_pizza extends AppCompatActivity implements View.OnClickListener{

    private CardView Mushroom,Margherita,Hawaiian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview_pizza);

        //defining Cards
        Mushroom = (CardView) findViewById(R.id.card_pizza_mushroom);
        Margherita = (CardView) findViewById(R.id.card_pizza_margherita);
        Hawaiian = (CardView) findViewById(R.id.card_pizza_hawaiian);

        //Add Click listener to the cards
        Mushroom.setOnClickListener(this);
        Margherita.setOnClickListener(this);
        Hawaiian.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent select;

        switch (v.getId()) {
            case R.id.card_pizza_mushroom :
                select = new Intent(this,Detail_pizza_mushroom.class);  startActivity(select);  break;
            case R.id.card_pizza_margherita :
                select = new Intent(this,Detail_pizza_margherita.class);  startActivity(select);  break;
            case R.id.card_pizza_hawaiian :
                select = new Intent(this,Detail_pizza_hawaiian.class);  startActivity(select);  break;

            default:break;
        }

    }
}
