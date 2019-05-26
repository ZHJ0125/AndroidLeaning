package com.example.ex2_10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar)findViewById(R.id.ProgressBar);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn1.setOnClickListener(new click1());
        btn2.setOnClickListener(new click2());
    }
    class click1 implements OnClickListener{
        @Override
        public void onClick(View v) {
            progressBar.incrementProgressBy(5);
        }
    }
    class click2 implements OnClickListener{
        @Override
        public void onClick(View v) {
            progressBar.incrementProgressBy(-5);
        }
    }
}
