package com.example.ex2_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public TextView txt1,txt2;
    public Button btn;
    public EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (TextView)findViewById(R.id.myTestView01);
        txt2 = (TextView)findViewById(R.id.myTextView02);
        edt = (EditText)findViewById(R.id.myEditText);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new onClick());
    }

    class onClick implements OnClickListener{
        @Override
        public void onClick(View v) {
            String passwd;
            passwd = edt.getText().toString();

            if (passwd.equals("abc123"))
                txt2.setText("欢迎来到山东科技大学");
            else
                txt2.setText("不是本校学生，请立刻离开");
        }
    }
}
