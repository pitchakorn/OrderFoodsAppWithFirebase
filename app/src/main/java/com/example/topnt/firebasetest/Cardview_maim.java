package com.example.topnt.firebasetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Cardview_maim extends AppCompatActivity implements View.OnClickListener {

    private CardView FingerFoods,Pizza,Pasta,Delight,Sandwich,EasternSoup,WesternSoup,Chicken,Fish,Snack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview_maim);

        //defining Cards
        FingerFoods = (CardView) findViewById(R.id.card_fingerfoods_main);
        Pizza = (CardView) findViewById(R.id.card_pizza_main);
        Pasta = (CardView) findViewById(R.id.card_pasta_main);
        Delight = (CardView) findViewById(R.id.card_delight_main);
        Sandwich = (CardView) findViewById(R.id.card_sandwich_main);
        EasternSoup = (CardView) findViewById(R.id.card_eastern_main);
        WesternSoup = (CardView) findViewById(R.id.card_western_main);
        Chicken = (CardView) findViewById(R.id.card_chicken_main);
        Fish = (CardView) findViewById(R.id.card_fish_main);
        Snack = (CardView) findViewById(R.id.card_snack_main);

        //Add Click listener to the cards
        FingerFoods.setOnClickListener(this);
        Pizza.setOnClickListener(this);
        Pasta.setOnClickListener(this);
        Delight.setOnClickListener(this);
        Sandwich.setOnClickListener(this);
        EasternSoup.setOnClickListener(this);
        WesternSoup.setOnClickListener(this);
        Chicken.setOnClickListener(this);
        Fish.setOnClickListener(this);
        Snack.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent select;

        switch (v.getId()) {
            case R.id.card_fingerfoods_main :
                select = new Intent(this,Cardview_fingerfood.class);  startActivity(select);  break;
            case R.id.card_pizza_main :
                select = new Intent(this,Cardview_pizza.class);  startActivity(select);  break;
            case R.id.card_pasta_main :
                select = new Intent(this,Cardview_pasta.class);  startActivity(select);  break;
            case R.id.card_delight_main :
                select = new Intent(this,Cardview_delight.class);  startActivity(select);  break;
            case R.id.card_sandwich_main :
                select = new Intent(this,Cardview_sandwich.class);  startActivity(select);  break;
            case R.id.card_eastern_main :
                select = new Intent(this,Cardview_eastern.class);  startActivity(select);  break;
            case R.id.card_western_main :
                select = new Intent(this,Cardview_western.class);  startActivity(select);  break;
            case R.id.card_chicken_main :
                select = new Intent(this,Cardview_chicken.class);  startActivity(select);  break;
            case R.id.card_fish_main :
                select = new Intent(this,Cardview_fish.class);  startActivity(select);  break;
            case R.id.card_snack_main :
                select = new Intent(this,Cardview_snack.class);  startActivity(select);  break;

            default:break;
        }


    }
}
