package com.example.shand.ex4_3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

class TestView extends View{
    public TestView(Context context, AttributeSet attrs){
        super(context, attrs);
    }
    protected void onDraw(Canvas canvas){
        canvas.drawColor(Color.CYAN);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(100, 120, 30, paint);
        paint.setColor(Color.WHITE);
        canvas.drawCircle(91, 111, 6, paint);
    }
}
