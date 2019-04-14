package com.example.shand.ex4_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int x1=150,y1=50;
    TestView testView;
    Button btn;
    EditText edit_y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testView = (TestView)findViewById(R.id.testView1);
        testView.setXY(x1,y1);
        btn = (Button)findViewById(R.id.button1);
        edit_y = (EditText)findViewById(R.id.editText1);
        btn.setOnClickListener(new mClick());
    }
    class mClick implements OnClickListener{
        @Override
        public void onClick(View arg0) {
            y1 = Integer.parseInt(edit_y.getText().toString());
            testView.setXY(x1,y1);
            testView.invalidate();
        }
    }
}
