package com.example.topnt.firebasetest;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.topnt.firebasetest.Model.Order;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Detail_western_minestrone extends AppCompatActivity {

    private Button btnOrder;
    EditText tableNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_western_minestrone);

        btnOrder = (Button) findViewById(R.id.btn_western_minestrone);
        tableNumber = (EditText) findViewById(R.id.edt_western_minestrone);


        //initial Firebase
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_order = database.getReference("Order");

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                table_order.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                        com.example.topnt.firebasetest.Model.Order order = new Order("MINESTRONE", "139");
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
