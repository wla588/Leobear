package com.mina.leobear;



import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Loading1 extends Activity {
/*
@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		LinearLayout cir=(LinearLayout)findViewById(R.id.circle);	//获取布局文件中添加的线性布局管理器
		///cir.setBackgroundResource(R.drawable.circling);
        final AnimationDrawable anim=(AnimationDrawable)cir.getBackground();	//获取AnimationDrawable对象
		anim.start();	//开始播放动画
			
	}
*/
	//	private Intent intent;
//	private Bundle bundle;
//	private String go;
	private Button button;
	private boolean flag=true;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		//设置全屏:方法2
		this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//隐藏标题栏
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
				
		setContentView(R.layout.loading);
/*		
		LinearLayout cir=(LinearLayout)findViewById(R.id.circle);	//获取布局文件中添加的线性布局管理器
		///cir.setBackgroundResource(R.drawable.circling);
        final AnimationDrawable anim=(AnimationDrawable)cir.getBackground();	//获取AnimationDrawable对象
        button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(flag){
					anim.start();	//开始播放动画
					flag=false;
				}else{
					anim.stop();	//停止播放动画
					flag=true;
				}
			}
        });*/
 /*      
   //     intent = this.getIntent();
	//	bundle = intent.getExtras();
	//	go = bundle.getString("go");
	//	if(go == "xz"){
			Thread thread = new Thread(new Runnable() {
			
				@Override
				public void run() {
					
					try {
						anim.start();	//开始播放动画
						Thread.sleep(1000);
					
						Intent intent = new Intent(Loading.this,Friends.class);
						startActivity(intent);
					
					} catch (InterruptedException e) {
						e.printStackTrace();
						
					}
				}
			});
			thread.start();
	}
		else if(go == "ks"){
*/
			Thread thread = new Thread(new Runnable() {
				
				@Override
				public void run() {
					
					try {
						
						Thread.sleep(1000);
					
						Intent intent = new Intent(Loading1.this,M.class);
						startActivity(intent);
					
					} catch (InterruptedException e) {
						e.printStackTrace();
						
					}
				}
			});
			thread.start();
		
	
		
    
	}
	
	
}
