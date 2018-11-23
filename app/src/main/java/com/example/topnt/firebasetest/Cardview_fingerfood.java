package com.example.topnt.firebasetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Cardview_fingerfood extends AppCompatActivity implements View.OnClickListener{

    private CardView ThaiStyle,Sesameball,Potato,DoubleDelight,Sour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview_fingerfood);

        //defining Cards
        ThaiStyle = (CardView) findViewById(R.id.card_fingerfoods_thaiStyle);
        Sesameball = (CardView) findViewById(R.id.card_fingerfoods_sesameball);
        Potato = (CardView) findViewById(R.id.card_fingerfoods_potato);
        DoubleDelight = (CardView) findViewById(R.id.card_fingerfoods_delight);
        Sour = (CardView) findViewById(R.id.card_fingerfoods_sour);

        //Add Click listener to the cards
        ThaiStyle.setOnClickListener(this);
        Sesameball.setOnClickListener(this);
        Potato.setOnClickListener(this);
        DoubleDelight.setOnClickListener(this);
        Sour.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent select;

        switch (v.getId()) {
            case R.id.card_fingerfoods_thaiStyle :
                select = new Intent(this,Detail_fingerfood_thai.class);  startActivity(select);  break;
            case R.id.card_fingerfoods_sesameball :
                select = new Intent(this,Detail_fingerfood_sesameball.class);  startActivity(select);  break;
            case R.id.card_fingerfoods_potato :
                select = new Intent(this,Detail_fingerfood_potato.class);  startActivity(select);  break;
            case R.id.card_fingerfoods_delight :
                select = new Intent(this,Detail_fingerfood_delight.class);  startActivity(select);  break;
            case R.id.card_fingerfoods_sour :
                select = new Intent(this,Detail_fingerfood_sour.class);  startActivity(select);  break;

            default:break;
        }


    }
}
