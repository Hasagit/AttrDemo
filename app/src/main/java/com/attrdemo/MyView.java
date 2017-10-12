package com.attrdemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by DengJf on 2017/10/12.
 */

public class MyView extends View{
    private String mtext;
    private int mcolor;
    private int msize;
    private float mfloat;

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.MyView);
        mtext = array.getString(R.styleable.MyView_mtext);
        mcolor = array.getColor(R.styleable.MyView_mcolor, Color.BLACK);
        msize = array.getDimensionPixelSize(R.styleable.MyView_msize, 100);
        mfloat=array.getFloat(R.styleable.MyView_mfloat, (float) 1.234);
        array.recycle();  //释放资源
        Log.i("debug","text:"+mtext);
        Log.i("debug","color:"+mcolor);
        Log.i("debug","size:"+msize);
        Log.i("debug","float:"+mfloat);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }



}
