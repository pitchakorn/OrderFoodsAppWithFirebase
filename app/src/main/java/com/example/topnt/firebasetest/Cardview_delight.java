package com.example.topnt.firebasetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Cardview_delight extends AppCompatActivity implements View.OnClickListener{

    private CardView Nasi,Lei,Pepper,Kwai,Japanese,Cantonese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview_delight);

        //defining Cards
        Nasi = (CardView) findViewById(R.id.card_delight_nasi);
        Lei = (CardView) findViewById(R.id.card_delight_lei);
        Pepper = (CardView) findViewById(R.id.card_delight_pepper);
        Kwai = (CardView) findViewById(R.id.card_delight_kwai);
        Japanese = (CardView) findViewById(R.id.card_delight_japanese);
        Cantonese = (CardView) findViewById(R.id.card_delight_cantonese);

        //Add Click listener to the cards
        Nasi.setOnClickListener(this);
        Lei.setOnClickListener(this);
        Pepper.setOnClickListener(this);
        Kwai.setOnClickListener(this);
        Japanese.setOnClickListener(this);
        Cantonese.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent select;

        switch (v.getId()) {
            case R.id.card_delight_nasi :
                select = new Intent(this,Detail_delight_nasi.class);  startActivity(select);  break;
            case R.id.card_delight_lei :
                select = new Intent(this,Detail_delight_lei.class);  startActivity(select);  break;
            case R.id.card_delight_pepper :
                select = new Intent(this,Detail_delight_pepper.class);  startActivity(select);  break;
            case R.id.card_delight_kwai :
                select = new Intent(this,Detail_delight_kwai.class);  startActivity(select);  break;
            case R.id.card_delight_japanese :
                select = new Intent(this,Detail_delight_japanese.class);  startActivity(select);  break;
            case R.id.card_delight_cantonese:
                select = new Intent(this,Detail_delight_cantonese.class);  startActivity(select);  break;

            default:break;
        }

    }
}
