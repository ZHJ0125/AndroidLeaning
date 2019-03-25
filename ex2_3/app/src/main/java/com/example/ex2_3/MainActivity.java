package com.example.ex2_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView txt;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.textView1);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new onClick());
    }

    class onClick implements OnClickListener{
        @Override
        public void onClick(View v) {
            int BLACK = 0xffcccccc;
            txt.setText("改变了文字及背景颜色");
            txt.setTextColor(Color.YELLOW);
            txt.setBackgroundColor(BLACK);
        }
    }
}
