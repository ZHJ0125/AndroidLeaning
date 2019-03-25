package com.example.shand.ex2_16;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    ListView list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView)findViewById(R.id.ListView01);
        String[] data ={
                "最炫民族风",
                "荷塘月色",
                "天蓝蓝",
                "最美天下",
                "自由飞翔",
        };
        list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data));
        list.setOnItemClickListener(new mItemClick());
    }
    class mItemClick implements OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            Toast.makeText(getApplicationContext(), "您选择的项目是：" + ((TextView)arg1).getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
