package com.example.topnt.firebasetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Cardview_western extends AppCompatActivity implements View.OnClickListener{

    private CardView Mushroom,Pumpkin,Garden,Minestrone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview_western);

        //defining Cards
        Mushroom = (CardView) findViewById(R.id.card_western_mushroom);
        Pumpkin = (CardView) findViewById(R.id.card_western_pumpkin);
        Garden = (CardView) findViewById(R.id.card_western_garden);
        Minestrone = (CardView) findViewById(R.id.card_western_minestrone);

        //Add Click listener to the cards
        Mushroom.setOnClickListener(this);
        Pumpkin.setOnClickListener(this);
        Garden.setOnClickListener(this);
        Minestrone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent select;

        switch (v.getId()) {
            case R.id.card_western_mushroom :
                select = new Intent(this,Detail_western_mushroom.class);  startActivity(select);  break;
            case R.id.card_western_pumpkin :
                select = new Intent(this,Detail_western_pumpkin.class);  startActivity(select);  break;
            case R.id.card_western_garden :
                select = new Intent(this,Detail_western_garden.class);  startActivity(select);  break;
            case R.id.card_western_minestrone :
                select = new Intent(this,Detail_western_minestrone.class);  startActivity(select);  break;

            default:break;
        }

    }
}
