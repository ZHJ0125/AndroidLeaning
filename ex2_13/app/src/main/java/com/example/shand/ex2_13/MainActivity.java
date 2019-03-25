package com.example.shand.ex2_13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button btn_last,btn_next;
    private int[] imgs={
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6
    };
    int index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView)findViewById(R.id.img);
        btn_last = (Button)findViewById(R.id.btn_last);
        btn_next = (Button)findViewById(R.id.btn_next);
        btn_last.setOnClickListener(new mClick());
        btn_next.setOnClickListener(new mClick());
    }

    class mClick implements OnClickListener{
        @Override
        public void onClick(View v) {
            if (v == btn_last){
                if (index>0 && index<imgs.length){
                    index--;
                    img.setImageResource(imgs[index]);
                }
                else {index = imgs.length+1;}
            }
            if (v == btn_next){
                if (index>0 && index<imgs.length-1){
                    index++;
                    img.setImageResource(imgs[index]);
                }
                else {index = imgs.length-1;}
            }
        }
    }
}
