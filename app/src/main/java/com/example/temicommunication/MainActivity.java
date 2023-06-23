package com.example.temicommunication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.robotemi.sdk.Robot;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private Robot robot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Temi SDK 초기화
        robot = Robot.getInstance();

        // 종료
        Button exitBtn = (Button)findViewById(R.id.btn1);
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // 액티비티 전환
        Button serveBtn = (Button)findViewById(R.id.btn2);
        Button temperBtn = (Button)findViewById(R.id.btn3);
        Button curPlantBtn = (Button)findViewById(R.id.btn5);
        Button orderBtn = (Button)findViewById(R.id.btn6);

        serveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ServeActivity.class);
                startActivity(intent);
            }
        });

        temperBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TemperActivity.class);
                startActivity(intent);
            }
        });

        curPlantBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CurPlentActivity.class);
                startActivity(intent);
            }
        });

        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OrderActivity.class);
                startActivity(intent);
            }
        });

        // 영상 통화 구현

        Button callBtn = (Button)findViewById(R.id.btn4);
        DatabaseReference callRef = firebaseDatabase.getReference("call");

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 테미 1로 영상 통화 걸기
                // 파이어 베이스로 bool값 전달
                // 테미 1이 정보 받아서 나한테 전화 걸도록 하기
                // 받기
                callRef.setValue(true);
            }
        });

    }

}