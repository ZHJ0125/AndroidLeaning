package com.example.shand.ex2_17;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] data={
                "python",
                "Java",
                "PHP",
                "Android",
                "JavaScript",
        };
        ListView list = getListView();
        TextView header = new TextView(this);
        header.setText("编程语言");
        header.setTextSize(24);
        list.addHeaderView(header);
        TextView foot = new TextView(this);
        foot.setText("请选择");
        foot.setTextSize(24);
        list.addFooterView(foot);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data));
        list.setOnItemClickListener(new mItemClick());
    }

    class mItemClick implements OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            Toast.makeText(getApplicationContext(), "您选择的语言是"+((TextView)arg1).getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
