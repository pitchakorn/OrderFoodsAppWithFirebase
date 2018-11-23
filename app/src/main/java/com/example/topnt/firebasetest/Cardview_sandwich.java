package com.example.topnt.firebasetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Cardview_sandwich extends AppCompatActivity implements View.OnClickListener{

    private CardView Egg,Lentil,Hummus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview_sandwich);

        //defining Cards
        Egg = (CardView) findViewById(R.id.card_sandwich_egg);
        Lentil = (CardView) findViewById(R.id.card_sandwich_lentil);
        Hummus = (CardView) findViewById(R.id.card_sandwich_hummus);

        //Add Click listener to the cards
        Egg.setOnClickListener(this);
        Lentil.setOnClickListener(this);
        Hummus.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent select;

        switch (v.getId()) {
            case R.id.card_sandwich_egg :
                select = new Intent(this,Detail_sandwich_egg.class);  startActivity(select);  break;
            case R.id.card_sandwich_lentil :
                select = new Intent(this,Detail_sandwich_lentil.class);  startActivity(select);  break;
            case R.id.card_sandwich_hummus :
                select = new Intent(this,Detail_sandwich_hummus.class);  startActivity(select);  break;

            default:break;
        }

    }
}
