package com.mina.leobear;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.Toast;

public class TextImageButton extends ImageButton{
	private String text = "";
	private int color = 0;
	private float textSize = 0f;
	private int num =0;
	private int id;

	public TextImageButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	public void setText(String text){
		
		this.text = text;
	}
	public void setColor(int color){
		this.color = color;
	}
	public void setTextSize(float size){
		this.textSize = size;
	}
	public String getText(){
		return this.text;
	}
	//点击次数
	public int getNum(){
		return this.num;
	}
	public void setNum(int num){
		this.num=num;
	}
	//获得id
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	
	@Override
	protected void onDraw(Canvas canvas){
		
		super.onDraw(canvas);
		
        Paint paint = new Paint();
        paint.setTextAlign(Align.CENTER);
        paint.setColor(color);
        paint.setTextSize(textSize);
        
        canvas.drawText(text,10,15, paint);
	}
}
