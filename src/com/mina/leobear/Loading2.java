package com.mina.leobear;



import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class Loading2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		//����ȫ��:����2
		this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//���ر�����
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
				
		setContentView(R.layout.loading);
		
		LinearLayout cir=(LinearLayout)findViewById(R.id.circle);	//��ȡ�����ļ�����ӵ����Բ��ֹ�����
        final AnimationDrawable anim=(AnimationDrawable)cir.getBackground();	//��ȡAnimationDrawable����
       
        
			Thread thread = new Thread(new Runnable() {
			
				@Override
				public void run() {
					
					try {
						anim.start();	//��ʼ���Ŷ���
						Thread.sleep(1000);
					
						Intent intent = new Intent(Loading2.this,MainActivity.class);
						startActivity(intent);
					
					} catch (InterruptedException e) {
						e.printStackTrace();
						
					}
				}
			});
			thread.start();
		
		
		
	
	}
	
	
}
