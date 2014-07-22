package com.mina.leobear;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Choose2 extends Activity {

	private ImageView xz;
	private ImageView ks;
	private ImageView fh;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.choose2);
			
		xz=(ImageView)findViewById(R.id.xuanze2);
		//第三种按钮
		xz.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
					
				Intent intent = new Intent(Choose2.this,Loading2.class);
					
				startActivity(intent);
					
				
			}
		});
		
			ks=(ImageView)findViewById(R.id.kuaisu2);
			//第三种按钮
			ks.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					
					Intent intent = new Intent(Choose2.this,Loading.class);
					
					startActivity(intent); 
				
				}
			});
			
			fh=(ImageView)findViewById(R.id.fanhui2);
			//第三种按钮
			fh.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent intent = new Intent(Choose2.this,Main.class);
					startActivity(intent);
					
				}
			});
		}
		
	
	
}
