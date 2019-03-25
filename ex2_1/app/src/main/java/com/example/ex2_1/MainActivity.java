package com.example.ex2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.graphics.Color;  //引用图形颜色组件
import android.widget.TextView; //引用文本标签组件

public class MainActivity extends AppCompatActivity {

    private TextView txt;   //声明文本标签对象
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.textView1);
        txt.setTextColor(Color.RED);
    }
}
