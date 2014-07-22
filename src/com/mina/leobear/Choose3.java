package com.mina.leobear;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Choose3 extends Activity {

	private ImageView xz;
	private ImageView ks;
	private ImageView fh;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.choose3);
			
		xz=(ImageView)findViewById(R.id.xuanze3);
		//�����ְ�ť
		xz.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
					
				Intent intent = new Intent(Choose3.this,Loading2.class);
					
				startActivity(intent);
					
				
			}
		});
		
			ks=(ImageView)findViewById(R.id.kuaisu3);
			//�����ְ�ť
			ks.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					
					Intent intent = new Intent(Choose3.this,Loading.class);
					
					startActivity(intent);
				
				}
			});
			
			fh=(ImageView)findViewById(R.id.fanhui3);
			//�����ְ�ť
			fh.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new Intent(Choose3.this,Main.class);
					startActivity(intent);
					
				}
			});
		}
		
}
