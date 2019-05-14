package zhj.com.ex5_3;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public class AudioService extends Service{
    private MediaPlayer mediaPlayer = null;
    private Intent intent2=null;
    private Bundle bundle2=null;
    private String audioPath;

    private void sendUpdateUI(int flag)
    {
        intent2=new Intent();
        intent2.setAction("music");
        bundle2=new Bundle();
        bundle2.putInt("backFlag",flag);
        intent2.putExtras(bundle2);
        sendBroadcast(intent2);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent,int flags,int startId)
    {
        super.onStartCommand(intent,flags,startId);
        audioPath=intent.getExtras().getString("audioPath");

        MainActivity.txt.setText(audioPath);

        if(mediaPlayer != null && mediaPlayer.isPlaying())
        {
            mediaPlayer.pause();
            sendUpdateUI(1);
        }
        else {
            if (mediaPlayer == null)
            {
                mediaPlayer = new MediaPlayer();
                try {
                    mediaPlayer.reset();
                    mediaPlayer.setDataSource(audioPath);
                    mediaPlayer.prepare();
                } catch (Exception e) {
                    Log.e("player","player prepare() err");
                }
            }
            mediaPlayer.start();
            sendUpdateUI(0);
        }
        return START_STICKY;
    }

    @Override
    public void onDestroy()
    {
        if(mediaPlayer != null)
        {
            mediaPlayer.reset();
            mediaPlayer.release();
            mediaPlayer = null;
            sendUpdateUI(2);
        }
        super.onDestroy();
    }

}
