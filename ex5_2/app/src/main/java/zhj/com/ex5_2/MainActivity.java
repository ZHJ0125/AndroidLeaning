package zhj.com.ex5_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    static TextView txt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.txt1);
        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new mClick());
    }
    class mClick implements OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setAction("abc");
            Bundle bundle = new Bundle();
            bundle.putString("hello", "这是广播消息");
            intent.putExtras(bundle);
            sendBroadcast(intent);
        }
    }
}