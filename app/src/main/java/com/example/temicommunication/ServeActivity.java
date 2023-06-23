package com.example.temicommunication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ServeActivity extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    DatabaseReference databaseReference = firebaseDatabase.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.serve);

        // 뒤로 가기
        Button backBtn = (Button)findViewById(R.id.btn1);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        // 지정 위치로 서빙해주는 로직

        Button tableBtn1 = (Button)findViewById(R.id.btn2);
        Button tableBtn2 = (Button)findViewById(R.id.btn3);
        Button tableBtn3 = (Button)findViewById(R.id.btn4);
        Button tableBtn4 = (Button)findViewById(R.id.btn5);
        Button tableBtn5 = (Button)findViewById(R.id.btn6);
        Button tableBtn6 = (Button)findViewById(R.id.btn7);

        tableBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child("table_loc").setValue(1);
            }
        });

        tableBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child("table_loc").setValue(2);
            }
        });

        tableBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child("table_loc").setValue(3);
            }
        });

        tableBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child("table_loc").setValue(4);
            }
        });

        tableBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child("table_loc").setValue(5);
            }
        });

        tableBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child("table_loc").setValue(6);
            }
        });

    }
}

