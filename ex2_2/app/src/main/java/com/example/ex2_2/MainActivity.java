package com.example.ex2_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private TextView txt;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView)findViewById(R.id.textView1);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new onClick());
    }
    class onClick implements OnClickListener{
        public void onClick(View v){
            MainActivity.this.setTitle(R.string.chn);
            txt.setText(R.string.text2);
        }
    }
}
