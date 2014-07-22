package com.mina.leobear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class Loading extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//设置全屏
		this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//隐藏标题栏
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		//加载布局
		setContentView(R.layout.activity_loading);
		
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(3000);
					
					Intent intent = new Intent(Loading.this,Login.class);
					startActivity(intent);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
					
				}
			}
		});
		thread.start();
	}
}
