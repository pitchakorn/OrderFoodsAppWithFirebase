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

public class Detail_sandwich_hummus extends AppCompatActivity {

    private Button btnOrder;
    EditText tableNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sandwich_hummus);

        btnOrder = (Button) findViewById(R.id.btn_sandwich_hummus);
        tableNumber = (EditText) findViewById(R.id.edt_sandwich_hummus);


        //initial Firebase
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_order = database.getReference("Order");

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                table_order.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                        com.example.topnt.firebasetest.Model.Order order = new Order("HUMMUS PLATTER", "189");
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
