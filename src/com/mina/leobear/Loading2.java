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
	
		//设置全屏:方法2
		this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//隐藏标题栏
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
				
		setContentView(R.layout.loading);
		
		LinearLayout cir=(LinearLayout)findViewById(R.id.circle);	//获取布局文件中添加的线性布局管理器
        final AnimationDrawable anim=(AnimationDrawable)cir.getBackground();	//获取AnimationDrawable对象
       
        
			Thread thread = new Thread(new Runnable() {
			
				@Override
				public void run() {
					
					try {
						anim.start();	//开始播放动画
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
