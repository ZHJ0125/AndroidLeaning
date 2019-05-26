package com.example.shand.ex3_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn1.setOnClickListener(new mClick());
        btn2.setOnClickListener(new mClick());
        btn3.setOnClickListener(new mClick());
    }
    class mClick implements OnClickListener{
        int m_year = 2019;
        int m_month = 4;
        int m_day = 3;
        int m_hour = 8;
        int m_minute = 7;
        @Override
        public void onClick(View v) {
            if(v == btn1){
                ProgressDialog d = new ProgressDialog(MainActivity.this);
                d.setTitle("进度条对话框");
                d.setIndeterminate(true);
                d.setMessage("程序正在加载...");
                d.setCancelable(true);
                d.setMax(10);
                d.show();
            }
            else if (v == btn2){
                OnDateSetListener dateSetListener = new OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        m_year = year;
                        m_month = month;
                        m_day = dayOfMonth;
                    }
                };
                DatePickerDialog date = new DatePickerDialog(MainActivity.this, dateSetListener, m_year, m_month, m_day);
                date.setTitle("日期对话框");
                date.show();
            }
            else if (v == btn3){
                OnTimeSetListener timeListener = new OnTimeSetListener(){
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        m_hour = hourOfDay;
                        m_minute = minute;
                    }
                };
                TimePickerDialog d = new TimePickerDialog(MainActivity.this, timeListener, m_hour, m_minute, true);
                d.setTitle("时间的对话框");
                d.show();
            }
        }
    }
}
