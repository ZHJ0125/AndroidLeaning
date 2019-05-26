package com.example.administrator.myapplication1;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView txt1,txt2,txt3;
    private static final int item1 = Menu.FIRST;
    private static final int item2 = Menu.FIRST+1;
    private static final int item3 = Menu.FIRST+2;
    String str[] = {"令狐冲", "杨过", "晓峰"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (TextView)findViewById(R.id.TextView1);
        txt2 = (TextView)findViewById(R.id.TextView2);
        txt3 = (TextView)findViewById(R.id.TextView3);
        txt1.setText(str[0].toString());
        txt2.setText(str[1].toString());
        txt3.setText(str[2].toString());
        registerForContextMenu(txt1);
        registerForContextMenu(txt2);
        registerForContextMenu(txt3);
    }
    public void onCreateContextMenu(ContextMenu menu, ContextMenuInfo menuInfo){
        menu.setHeaderTitle("人物介绍");
        menu.add(0, item1, 0, "武功");
        menu.add(0, item2, 0, "战斗力");
        menu.add(0, item3, 0, "语录");
    }
    public boolean onContextItemSelected(MenuItem item){
        switch(item.getItemId()){
            case item1:
                break;
            case item2:
                break;
            case item3:
                break;
        }
        return true;
    }
}

