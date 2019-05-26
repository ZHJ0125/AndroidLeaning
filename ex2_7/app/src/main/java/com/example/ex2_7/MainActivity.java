package com.example.ex2_7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1,img2,img3,img4,img5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = this.findViewById(R.id.mImage1);
        img2 = this.findViewById(R.id.mImage2);
        img3 = this.findViewById(R.id.mImage3);
        img4 = this.findViewById(R.id.mImage4);
        img5 = this.findViewById(R.id.mImage5);

        img1.setImageResource(R.drawable.img1);
        img2.setImageResource(R.drawable.img2);
        img3.setImageResource(R.drawable.img3);
        img4.setImageResource(R.drawable.img4);
        img5.setImageResource(R.drawable.img5);
    }
}
