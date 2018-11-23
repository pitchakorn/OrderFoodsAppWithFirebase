package com.example.topnt.firebasetest;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.example.topnt.firebasetest.Model.User;
import com.example.topnt.firebasetest.Model.Order;
import com.google.firebase.database.ValueEventListener;


public class Detail_fingerfood_thai extends AppCompatActivity {

    EditText tableNumber;
    private Button btnOrder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_fingerfood_thai);

        btnOrder = (Button) findViewById(R.id.btn_fingerfood_thai);
        tableNumber = (EditText) findViewById(R.id.edt_fingerfood_thai);


        //initial Firebase
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_order = database.getReference("Order");

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //"THAI STYLE SALAD"
                table_order.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        Order order = new Order("THAI STYLE SALAD","159");
                        table_order.child(tableNumber.getText().toString()).setValue(order);
                        finish();

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });


            }
        });

    }
}
