package com.example.temicommunication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ServeActivity extends AppCompatActivity {

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



    }
}

