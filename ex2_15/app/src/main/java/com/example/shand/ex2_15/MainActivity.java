package com.example.shand.ex2_15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Gravity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn1.setOnClickListener(new mClick());
        btn2.setOnClickListener(new mClick());
        btn3.setOnClickListener(new mClick());
    }
    class mClick implements OnClickListener{
        Toast toast;
        LinearLayout toastView;
        ImageView imageCodeProject;
        @Override
        public void onClick(View v) {
            if (v == btn1){
                Toast.makeText(getApplicationContext(),"默认Toast方式",Toast.LENGTH_SHORT).show();
            }
            else if (v == btn2){
                Toast.makeText(getApplicationContext(),"自定义Toast的位置",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
            else if (v == btn3){
                Toast.makeText(getApplicationContext(),"带图标的Toast",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0,80);
                toastView = (LinearLayout)toast.getView();
                imageCodeProject = new ImageView(MainActivity.this);
                imageCodeProject.setImageResource(R.drawable.icon);
                toastView.addView(imageCodeProject, 0);
                toast.show();
            }
        }
    }
}
