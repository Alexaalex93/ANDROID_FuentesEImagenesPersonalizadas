package com.example.cice.gatostextview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by cice on 14/2/17.
 */

public class MyTextView extends TextView{//Con esta aplicacion estoy modificando el tipo de fuente
    public MyTextView(Context context) {
        super(context);
        //Creamos un nuevo typeface con la vitsa de los buhos y se lo añadimos
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"Owl.ttf");
        this.setTypeface(typeface);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"Owl.ttf");
        this.setTypeface(typeface);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(),"Owl.ttf");
        this.setTypeface(typeface);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
