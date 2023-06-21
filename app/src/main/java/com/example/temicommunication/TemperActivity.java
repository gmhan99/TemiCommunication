package com.example.temicommunication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class TemperActivity extends AppCompatActivity {

    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temper);

        // 뒤로 가기
        Button backBtn = (Button) findViewById(R.id.btn1);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        // 아두이노, 파이어베이스 통신으로 값 가져오기

        // 채소 그룹 1
        TextView temExpTxt1 = (TextView) findViewById(R.id.t2);
        TextView humExpTxt1 = (TextView) findViewById(R.id.t3);
        TextView temTxt1 = (TextView) findViewById(R.id.t4);
        TextView humTxt1 = (TextView) findViewById(R.id.t5);

        // 채소 그룹 2
        TextView temExpTxt2 = (TextView) findViewById(R.id.t9);
        TextView humExpTxt2 = (TextView) findViewById(R.id.t10);
        TextView temTxt2 = (TextView) findViewById(R.id.t11);
        TextView humTxt2 = (TextView) findViewById(R.id.t12);

        // 채소 그룹 3
        TextView temExpTxt3 = (TextView) findViewById(R.id.t16);
        TextView humExpTxt3 = (TextView) findViewById(R.id.t17);
        TextView temTxt3 = (TextView) findViewById(R.id.t18);
        TextView humTxt3 = (TextView) findViewById(R.id.t19);

        DatabaseReference temRef = firebaseDatabase.getReference();

        temRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                float tem1 = (float) snapshot.child("number1").child("Temperature").getValue(Float.class);
                float hum1 = (float) snapshot.child("number1").child("Humidity").getValue(Float.class);
                temTxt1.setText(Float.toString(tem1) + "도");
                humTxt1.setText(Float.toString(hum1) + "%");

                if (tem1 >= 15 && tem1 <= 20) temExpTxt1.setText("온도가 적당합니다!");
                else if (tem1 < 15) temExpTxt1.setText("온도가 낮습니다.");
                else if (tem1 > 20) temExpTxt1.setText("온도가 높습니다.");

                if (hum1 >= 60 && hum1 <= 80) humExpTxt1.setText("습도가 적당합니다!");
                else if (hum1 < 60) humExpTxt1.setText("습도가 낮습니다.");
                else if (hum1 > 80) humExpTxt1.setText("습도가 높습니다.");



                float tem2 = (float) snapshot.child("number2").child("Temperature").getValue(Float.class);
                float hum2 = (float) snapshot.child("number2").child("Humidity").getValue(Float.class);
                temTxt2.setText(Float.toString(tem2) + "도");
                humTxt2.setText(Float.toString(hum2) + "%");

                if (tem2 >= 21 && tem2 <= 23) temExpTxt2.setText("온도가 적당합니다!");
                else if (tem2 < 21) temExpTxt2.setText("온도가 낮습니다.");
                else if (tem2 > 23) temExpTxt2.setText("온도가 높습니다.");

                if (hum2 >= 45 && hum2 <= 60) humExpTxt2.setText("습도가 적당합니다!");
                else if (hum2 < 45) humExpTxt2.setText("습도가 낮습니다.");
                else if (hum2 > 60) humExpTxt2.setText("습도가 높습니다.");

                float tem3 = (float) snapshot.child("number3").child("Temperature").getValue(Float.class);
                float hum3 = (float) snapshot.child("number3").child("Humidity").getValue(Float.class);
                temTxt3.setText(Float.toString(tem3) + "도");
                humTxt3.setText(Float.toString(hum3) + "%");

                if (tem3 >= 18 && tem3 <= 24) temExpTxt3.setText("온도가 적당합니다!");
                else if (tem3 < 18) temExpTxt3.setText("온도가 낮습니다.");
                else if (tem3 > 24) temExpTxt3.setText("온도가 높습니다.");

                if (hum3 >= 40 && hum3 <= 70) humExpTxt3.setText("습도가 적당합니다!");
                else if (hum3 < 40) humExpTxt3.setText("습도가 낮습니다.");
                else if (hum3 > 70) humExpTxt3.setText("습도가 높습니다.");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}
