package com.example.ex1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;    //增加导入ImageView类的语句

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ImageView img = new ImageView(this);    //创建ImageView对象并实例化
        img.setImageResource(R.drawable.me);    //ImageView对象设置引用图片资源
        setContentView(img);    //把ImageView对象显示在屏幕上
    }
}
