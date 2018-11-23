package com.example.topnt.firebasetest;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.topnt.firebasetest.Common.Common;
import com.example.topnt.firebasetest.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

public class logIn extends AppCompatActivity {

    EditText edtPhone , edtPassword;
    Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        edtPhone = (MaterialEditText)findViewById(R.id.edtPhone);
        edtPassword = (MaterialEditText)findViewById(R.id.edtPassword);
        btnLogIn = (Button)findViewById(R.id.btnLogIn);

        //initial Firebase
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("User");

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ProgressDialog for tell you .
                final ProgressDialog mDialog = new ProgressDialog(logIn.this);
                mDialog.setMessage("Please waiting ...");
                mDialog.show();


                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        //Check if user not exist in database
                        if (dataSnapshot.child(edtPhone.getText().toString()).exists()){

                            //Get User Information
                            mDialog.dismiss();
                            User user = dataSnapshot.child(edtPhone.getText().toString()).getValue(User.class);
                            if (user.getPassword().equals(edtPassword.getText().toString())){
                                {
                                    Toast.makeText(logIn.this, "Login success", Toast.LENGTH_SHORT).show();
                                    Intent cardview = new Intent(logIn.this,Cardview_maim.class);
                                    startActivity(cardview);
                                }
                            }else {
                                Toast.makeText(logIn.this, "Wrong Password", Toast.LENGTH_SHORT).show();
                            }
                        } else{
                            mDialog.dismiss();
                            Toast.makeText(logIn.this, "User not exist in Database", Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        });

    }
}
