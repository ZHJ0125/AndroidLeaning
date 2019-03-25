package com.example.ex2_11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox ch1,ch2,ch3;
    Button okBtn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1 = (CheckBox)findViewById(R.id.check1);
        ch2 = (CheckBox)findViewById(R.id.check2);
        ch3 = (CheckBox)findViewById(R.id.check3);
        okBtn = (Button)findViewById(R.id.button);
        txt = (TextView)findViewById(R.id.textView2);
        okBtn.setOnClickListener(new click());
    }
    class click implements  OnClickListener{
        @Override
        public void onClick(View v) {
            String str="";
            if (ch1.isChecked()) str=str+"\n"+ch1.getText();
            if (ch2.isChecked()) str=str+"\n"+ch2.getText();
            if (ch3.isChecked()) str=str+"\n"+ch3.getText();
            txt.setText("您选择了："+str);
        }
    }
}
