package com.mina.leobear;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Choose extends Activity {

	private ImageView xz;
//	private ImageView ks;
	private ImageView fh;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.choose);
			
		xz=(ImageView)findViewById(R.id.xuanze);
		//�����ְ�ť
		xz.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
					
				Intent intent = new Intent(Choose.this,Loading2.class);
					
				startActivity(intent);
					
				
			}
		});
/*		
			ks=(ImageView)findViewById(R.id.kuaisu);
			//�����ְ�ť
			ks.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					
					Intent intent = new Intent(Choose.this,Loading.class);
					
					startActivity(intent);
				
				}
			});
	*/		
			fh=(ImageView)findViewById(R.id.fanhui);
			//�����ְ�ť
			fh.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new Intent(Choose.this,Main.class);
					startActivity(intent);
					
				}
			});
		}
		
		
		
	

}
