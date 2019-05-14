package zhj.com.ex5_3;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static zhj.com.ex5_3.PermisionUtils.verifyStoragePermissions;

public class MainActivity extends Activity {
    Broadcast mBroadcast=null;
    static Button btnStart;
    Button btnStop;
    Intent intent;
    String AUDIO_PATH="/sdcard/Music/happy.mp3";
    static TextView txt;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        verifyStoragePermissions(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView)findViewById(R.id.txt); //用于测试广播接收的文件路径是否正确
        btnStart=(Button)findViewById(R.id.btnPlayOrPause);
        btnStop=(Button)findViewById(R.id.btnStop);
        IntentFilter filter=new IntentFilter("music");
        mBroadcast=new Broadcast();
        registerReceiver(mBroadcast,filter);
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(mBroadcast);
    }

    public void ClickHandler(View v)
    {
        switch (v.getId())
        {
            case R.id.btnPlayOrPause:
                intent=new Intent(MainActivity.this,zhj.com.ex5_3.AudioService.class);
                Bundle bundle=new Bundle();
                bundle.putString("audioPath",AUDIO_PATH);
                intent.putExtras(bundle);
                startService(intent);
                break;
            case R.id.btnStop:
                if(intent != null)
                {
                    stopService(intent);
                }
                break;
        }
    }
}
