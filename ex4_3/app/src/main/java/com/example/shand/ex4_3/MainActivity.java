package com.example.shand.ex4_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TestView tView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tView = (TestView)findViewById(R.id.testView1);
        setContentView(R.layout.activity_main);
    }
}
