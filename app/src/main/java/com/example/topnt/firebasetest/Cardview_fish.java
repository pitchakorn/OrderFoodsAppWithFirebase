package com.example.topnt.firebasetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Cardview_fish extends AppCompatActivity implements View.OnClickListener{

    private CardView Asam,Dou,Toman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview_fish);

        //defining Cards
        Asam = (CardView) findViewById(R.id.card_fish_asam);
        Dou = (CardView) findViewById(R.id.card_fish_duo);
        Toman = (CardView) findViewById(R.id.card_fish_toman);

        //Add Click listener to the cards
        Asam.setOnClickListener(this);
        Dou.setOnClickListener(this);
        Toman.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent select;

        switch (v.getId()) {
            case R.id.card_fish_asam :
                select = new Intent(this,Detail_fish_asam.class);  startActivity(select);  break;
            case R.id.card_fish_duo :
                select = new Intent(this,Detail_fish_duo.class);  startActivity(select);  break;
            case R.id.card_fish_toman :
                select = new Intent(this,Detail_fish_toman.class);  startActivity(select);  break;

            default:break;
        }

    }
}
