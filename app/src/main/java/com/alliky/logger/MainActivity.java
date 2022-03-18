package com.alliky.logger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alliky.log.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.init(true);

        Logger.d("Logger", "初始化成功");

    }
}