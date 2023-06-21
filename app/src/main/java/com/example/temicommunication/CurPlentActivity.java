package com.example.temicommunication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CurPlentActivity extends AppCompatActivity {

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



    }
}
