package com.example.shand.ex4_2;

import android.util.AttributeSet;
import android.view.View;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class TestView extends View{
    int x,y;
    public TestView (Context context, AttributeSet attrs){
        super(context, attrs);
    }
    void setXY(int _x, int _y){
        x = _x;
        y = _y;
    }
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(Color.CYAN);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(x, y, 15, paint);
        paint.setColor(Color.WHITE);
        canvas.drawCircle(x-6, y-6, 3, paint);
    }
}
