package zhj.com.ex5_1;

import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button startbtn,stopbtn;
    Context context;
    Intent intent;
    static TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startbtn = (Button)findViewById(R.id.btn1);
        stopbtn = (Button)findViewById(R.id.btn2);
        startbtn.setOnClickListener(new mClick());
        stopbtn.setOnClickListener(new mClick());
        txt = (TextView)findViewById(R.id.text1);
        intent = new Intent(MainActivity.this, AudioSrv.class);
    }
    class mClick implements OnClickListener{
        @Override
        public void onClick(View v) {
            if (v == startbtn){
                MainActivity.this.startService(intent);
                txt.setText("Start Service ......");
            }
            else if (v == stopbtn){
                MainActivity.this.stopService(intent);
                txt.setText("Stop Service ......");
            }
        }
    }
}