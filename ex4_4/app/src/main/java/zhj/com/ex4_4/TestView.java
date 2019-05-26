package zhj.com.ex4_4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class TestView extends View{
    int x=150,y=50;
    public TestView (Context context, AttributeSet attrs){
        super(context, attrs);
    }
    void getXY(int _x, int _y){
        x = _x;
        y = _y;
    }
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.CYAN);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(x, y, 30, paint);
        paint.setColor(Color.WHITE);
        canvas.drawCircle(x-9, y-9, 9 ,paint);
    }
}
