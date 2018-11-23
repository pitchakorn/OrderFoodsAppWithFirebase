package com.example.topnt.firebasetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Cardview_snack extends AppCompatActivity implements View.OnClickListener{

    private CardView Ginger,Coconut,Red,Char,Chai,Onde,Yam,Layer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview_snack);

        //defining Cards
        Ginger = (CardView) findViewById(R.id.card_snack_ginger);
        Coconut = (CardView) findViewById(R.id.card_snack_coconut);
        Red = (CardView) findViewById(R.id.card_snack_red);
        Char = (CardView) findViewById(R.id.card_snack_char);
        Chai = (CardView) findViewById(R.id.card_snack_chai);
        Onde = (CardView) findViewById(R.id.card_snack_onde);
        Yam = (CardView) findViewById(R.id.card_snack_yam);
        Layer = (CardView) findViewById(R.id.card_snack_layer);


        //Add Click listener to the cards
        Ginger.setOnClickListener(this);
        Coconut.setOnClickListener(this);
        Red.setOnClickListener(this);
        Char.setOnClickListener(this);
        Chai.setOnClickListener(this);
        Onde.setOnClickListener(this);
        Yam.setOnClickListener(this);
        Layer.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent select;

        switch (v.getId()) {
            case R.id.card_snack_ginger :
                select = new Intent(this,Detail_snack_ginger.class);  startActivity(select);  break;
            case R.id.card_snack_coconut :
                select = new Intent(this,Detail_snack_coconut.class);  startActivity(select);  break;
            case R.id.card_snack_red :
                select = new Intent(this,Detail_snack_red.class);  startActivity(select);  break;
            case R.id.card_snack_char :
                select = new Intent(this,Detail_snack_char.class);  startActivity(select);  break;
            case R.id.card_snack_chai :
                select = new Intent(this,Detail_snack_chai.class);  startActivity(select);  break;
            case R.id.card_snack_onde :
                select = new Intent(this,Detail_snack_onde.class);  startActivity(select);  break;
            case R.id.card_snack_yam :
                select = new Intent(this,Detail_snack_yam.class);  startActivity(select);  break;
            case R.id.card_snack_layer :
                select = new Intent(this,Detail_snack_layer.class);  startActivity(select);  break;

            default:break;
        }

    }
}
