package com.example.ex_3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class SampleCanvas extends View {
    Paint paint=new Paint();
    public SampleCanvas(Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas){
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(10);
        canvas.drawRect(150, 250, 300, 300, paint);
        paint.setColor(Color.GREEN);
        canvas.drawRect(700,700,800,800,paint);
        paint.setColor(Color.MAGENTA);
        canvas.drawCircle(500, 500, 50, paint);
        paint.setColor(Color.RED);
        canvas.drawLine(200, 50, 350, 50, paint);}

}
