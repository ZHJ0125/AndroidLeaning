package zhj.com.ex5_3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class Broadcast extends BroadcastReceiver{
    @Override
    public void onReceive(Context context,Intent intent)
    {
        int backFlag=intent.getExtras().getInt("backFlag");
        switch (backFlag)
        {
            case 0:
                MainActivity.btnStart.setText("暂停");
                break;
            case 1:
            case 2:
                MainActivity.btnStart.setText("播放");
                break;
        }
    }
}