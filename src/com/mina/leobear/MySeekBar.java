package com.mina.leobear;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;

public class MySeekBar extends SeekBar{
	 public MySeekBar(Context context) {

         super(context);

         // TODO Auto-generated constructor stub

 }



 public MySeekBar(Context context, AttributeSet attrs) {

         this(context, attrs, android.R.attr.seekBarStyle);

 }



 public MySeekBar(Context context, AttributeSet attrs, int defStyle) {

         super(context, attrs, defStyle);

 }

 /**

  * onTouchEvent ���� SeekBar �̳еĳ����� AbsSeekBar ��

  * ����Կ������ǵļ̳й�ϵ

  */

 @Override

 public boolean onTouchEvent(MotionEvent event) {

         // TODO Auto-generated method stub

         //ԭ����Ҫ��TouchEvent������ȥ��,���ǲ�����������ȥ������

         //return super.onTouchEvent(event);

         

         return false ;

 }



}
