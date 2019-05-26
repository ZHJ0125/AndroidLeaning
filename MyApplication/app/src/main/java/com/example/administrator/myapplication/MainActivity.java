package com.example.administrator.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView txt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.TextView1);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        menu.add(1,1,1,"菜单项1");
        menu.add(1,2,2,"菜单项2");
        menu.add(1,3,3,"菜单项3");
        menu.add(1,4,4,"菜单项4");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        String title = "选择了" + item.getTitle().toString();
        switch (item.getItemId()){
            case 1:
                txt.setText(title);
                break;
            case 2:
                txt.setText(title);
                break;
            case 3:
                txt.setText(title);
                break;
            case 4:
                txt.setText(title);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
