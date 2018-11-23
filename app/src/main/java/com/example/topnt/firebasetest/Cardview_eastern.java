package com.example.topnt.firebasetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Cardview_eastern extends AppCompatActivity implements View.OnClickListener{

    private CardView Lotus,Old,Burdock,Abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview_eastern);
        //defining Cards
        Lotus = (CardView) findViewById(R.id.card_eastern_lotus);
        Old = (CardView) findViewById(R.id.card_eastern_old);
        Burdock = (CardView) findViewById(R.id.card_eastern_burdock);
        Abc = (CardView) findViewById(R.id.card_eastern_abc);

        //Add Click listener to the cards
        Lotus.setOnClickListener(this);
        Old.setOnClickListener(this);
        Burdock.setOnClickListener(this);
        Abc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent select;

        switch (v.getId()) {
            case R.id.card_eastern_lotus :
                select = new Intent(this,Detail_eastern_lotus.class);  startActivity(select);  break;
            case R.id.card_eastern_old:
                select = new Intent(this,Detail_eastern_old.class);  startActivity(select);  break;
            case R.id.card_eastern_burdock :
                select = new Intent(this,Detail_eastern_burdock.class);  startActivity(select);  break;
            case R.id.card_eastern_abc :
                select = new Intent(this,Detail_eastern_abc.class);  startActivity(select);  break;

            default:break;
        }

    }
}
