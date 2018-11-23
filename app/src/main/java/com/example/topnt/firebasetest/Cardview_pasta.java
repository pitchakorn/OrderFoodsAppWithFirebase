package com.example.topnt.firebasetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Cardview_pasta extends AppCompatActivity implements View.OnClickListener{

    private CardView Garden,Spicy,Bolognese,Cauliflower,Fusion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview_pasta);
        //defining Cards
        Garden = (CardView) findViewById(R.id.card_pasta_garden);
        Spicy = (CardView) findViewById(R.id.card_pasta_spicy);
        Bolognese = (CardView) findViewById(R.id.card_pasta_bolognese);
        Cauliflower = (CardView) findViewById(R.id.card_pasta_cauliflower);
        Fusion = (CardView) findViewById(R.id.card_pasta_fusion);

        //Add Click listener to the cards
        Garden.setOnClickListener(this);
        Spicy.setOnClickListener(this);
        Bolognese.setOnClickListener(this);
        Cauliflower.setOnClickListener(this);
        Fusion.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent select;

        switch (v.getId()) {
            case R.id.card_pasta_garden :
                select = new Intent(this,Detail_pasta_garden.class);  startActivity(select);  break;
            case R.id.card_pasta_spicy :
                select = new Intent(this,Detail_pasta_spicy.class);  startActivity(select);  break;
            case R.id.card_pasta_bolognese :
                select = new Intent(this,Detail_pasta_bolognese.class);  startActivity(select);  break;
            case R.id.card_pasta_cauliflower :
                select = new Intent(this,Detail_pasta_cauliflower.class);  startActivity(select);  break;
            case R.id.card_pasta_fusion :
                select = new Intent(this,Detail_pasta_fusion.class);  startActivity(select);  break;

            default:break;
        }

    }
}
