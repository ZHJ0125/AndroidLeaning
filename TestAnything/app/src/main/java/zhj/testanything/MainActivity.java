package zhj.testanything;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tView=new TextView(this);
        setContentView(tView);
    }
    private class TestView extends View
    {
        public TestView(Context context)
        {
            super(context);
        }
        @Override
        protected void onDraw(Canvas canvas)
        {
            canvas.drawColor(Color.CYAN);
            Paint paint=new Paint();
            paint.setStrokeWidth(3);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            canvas.drawRect(10,10,70,70,paint);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(100,10,170,70,paint);
            paint.setColor(Color.BLUE);
            canvas.drawCircle(91,111,6,paint);
            paint.setColor(Color.RED);
            Path path=new Path();
            path.moveTo(100,170);
            path.lineTo(70,230);
            path.lineTo(130,230);
            path.close();
            canvas.drawPath(path,paint);
            paint.setTextSize(48);
            paint.setColor(Color.BLUE);
            canvas.drawText(getResources().getString(R.string.app_name),230,270,paint);

        }
    }
}
