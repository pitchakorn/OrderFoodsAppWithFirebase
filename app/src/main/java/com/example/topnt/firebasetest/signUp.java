package com.example.topnt.firebasetest;

import android.app.ProgressDialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.topnt.firebasetest.Model.User;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class signUp extends AppCompatActivity {

    EditText edtPhone , edtName , edtPassword;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edtPhone = (EditText)findViewById(R.id.edtPhone);
        edtName = (EditText)findViewById(R.id.edtName);
        edtPassword = (EditText)findViewById(R.id.edtPassword);

        btnSignUp = (Button)findViewById(R.id.btnSignUp);

        //initial Firebase
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference table_user = database.getReference("User");

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //ProgressDialog for tell you .
                final ProgressDialog mDialog = new ProgressDialog(signUp.this);
                mDialog.setMessage("Please waiting ...");
                mDialog.show();

                table_user.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        //Check if already user phone
                        if (dataSnapshot.child(edtPhone.getText().toString()).exists()){
                            mDialog.dismiss();
                            Toast.makeText(signUp.this, "Phone Number already register", Toast.LENGTH_SHORT).show();
                        }else {
                            User user = new User(edtName.getText().toString(),edtPassword.getText().toString());
                            table_user.child(edtPhone.getText().toString()).setValue(user);
                            Toast.makeText(signUp.this, "Sign Up successfully", Toast.LENGTH_SHORT).show();
                            finish();
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}
