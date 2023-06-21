package com.example.temicommunication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class CurPlentActivity extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cur_plent);

        // 뒤로 가기
        Button backBtn = (Button)findViewById(R.id.btn1);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        // 물주기 버튼
        // 1. 해당 식물까지 간다.
        // 2. 파이어베이스 -> 아두이노로 물을 주도록 한다.

        Button waterBtn1 = (Button)findViewById(R.id.btn2);
        Button waterBtn2 = (Button)findViewById(R.id.btn3);
        Button waterBtn3 = (Button)findViewById(R.id.btn4);

        DatabaseReference wRef1 = firebaseDatabase.getReference("number4").child("data");

        waterBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wRef1.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        int flag = (int) snapshot.getValue(Integer.class);
                        if (flag == 0)
                            wRef1.setValue(1);
                        else if (flag == 1)
                            wRef1.setValue(0);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });

    }
}
