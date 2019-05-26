package zhj.com.ex5_2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TestReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        //MainActivity.txt.setText("Here........");
        String str = intent.getExtras().getString("hello");
        MainActivity.txt.setText(str);
    }
}