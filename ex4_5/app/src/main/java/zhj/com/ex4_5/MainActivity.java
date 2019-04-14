package zhj.com.ex4_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private HandWrite handWrite = null;
    private Button clear = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handWrite = (HandWrite)findViewById(R.id.handwriteview);
        clear = (Button)findViewById(R.id.clear);
        clear.setOnClickListener(new mClick());
    }
    class mClick implements OnClickListener{
        @Override
        public void onClick(View v) {
            handWrite.clear();
        }
    }
}
