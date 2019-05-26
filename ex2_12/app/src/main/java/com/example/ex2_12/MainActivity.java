package com.example.ex2_12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    RadioButton radioGroup1,radioGroup2;
    Button btn;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.text02);
        radioGroup1 = (RadioButton) findViewById(R.id.boy01);
        radioGroup2 = (RadioButton) findViewById(R.id.girl01);
        btn = (Button)findViewById(R.id.myButton);
        edt = (EditText)findViewById(R.id.edit1);
        btn.setOnClickListener(new onClick());
    }
    class onClick implements OnClickListener{
        @Override
        public void onClick(View v) {
            CharSequence str="" ,name="";
            name = edt.getText();
            if (radioGroup1.isChecked())
                str = radioGroup1.getText();
            if (radioGroup2.isChecked())
                str = radioGroup2.getText();
            textView.setText("您输入的信息是：\n 姓名："+name+"\n 性别："+str);
        }
    }
}
