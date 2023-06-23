package com.example.temicommunication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        // 뒤로 가기
        Button backBtn = (Button)findViewById(R.id.btn1);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Button tableBtn1 = (Button)findViewById(R.id.btn2);
        Button tableBtn2 = (Button)findViewById(R.id.btn3);
        Button tableBtn3 = (Button)findViewById(R.id.btn4);
        Button tableBtn4 = (Button)findViewById(R.id.btn5);
        Button tableBtn5 = (Button)findViewById(R.id.btn6);
        Button tableBtn6 = (Button)findViewById(R.id.btn7);

        TextView t1 = (TextView)findViewById(R.id.t2);
        TextView t2 = (TextView)findViewById(R.id.t4);
        TextView t3 = (TextView)findViewById(R.id.t6);
        TextView t4 = (TextView)findViewById(R.id.t8);
        TextView t5 = (TextView)findViewById(R.id.t10);
        TextView t6 = (TextView)findViewById(R.id.t12);

        tableBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("주문 없음");
            }
        });

        tableBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("주문 없음");
            }
        });

        tableBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3.setText("주문 없음");
            }
        });

        tableBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t4.setText("주문 없음");
            }
        });

        tableBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t5.setText("주문 없음");
            }
        });

        tableBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t6.setText("주문 없음");
            }
        });

    }

}
