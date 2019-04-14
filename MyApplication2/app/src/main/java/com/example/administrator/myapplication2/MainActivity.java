package com.example.administrator.myapplication2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2;
    LinearLayout login;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn1.setOnClickListener(new mClick());
        btn2.setOnClickListener(new mClick());
    }
    class mClick implements OnClickListener{
        Builder dialog = new AlertDialog.Builder(MainActivity.this);
        public void onClick(View arg0){
            if(arg0==btn1){
                dialog.setTitle("警告");
                dialog.setIcon(R.drawable.icon1);
                dialog.setMessage("本操作可能泄露信息");
                dialog.setPositiveButton("确定", new okClick());
                dialog.create();
                dialog.show();
            }
            else if (arg0==btn2){
                login = (LinearLayout)getLayoutInflater().inflate(R.layout.login, null);
                dialog.setTitle("用户登录").setMessage("请用户输入用户名和密码").setView(login);
                dialog.setPositiveButton("确定", new loginClick());
                dialog.setNegativeButton("退出", new exitClick());
                dialog.setIcon(R.drawable.icon2);
                dialog.create();
                dialog.show();
            }
        }
    }
    class okClick implements DialogInterface.OnClickListener{
        @Override
        public void onClick(DialogInterface dialog, int which) {
            dialog.cancel();
        }
    }
    class loginClick implements DialogInterface.OnClickListener{
        EditText txt;
        @Override
        public void onClick(DialogInterface dialog, int which) {
            txt = (EditText)login.findViewById(R.id.paswdEdit);
            if ((txt.getText().toString()).equals("admin")){
                Toast.makeText(getApplicationContext(), "登陆成功", Toast.LENGTH_SHORT).show();
            }
            else
                Toast.makeText(getApplicationContext(), "密码错误", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        }
    }
    class exitClick implements DialogInterface.OnClickListener{
        @Override
        public void onClick(DialogInterface dialog, int which) {
            MainActivity.this.finish();
        }
    }
}

