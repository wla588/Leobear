package com.mina.leobear;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity {
	
	private EditText userName;
	private EditText password;
	private Button login;
	private Button register;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//隐藏标题栏
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.activity_login);
		
		userName=(EditText)this.findViewById(R.id.userName);
		password=(EditText)this.findViewById(R.id.password);
		login=(Button)this.findViewById(R.id.button_login);
		register=(Button)this.findViewById(R.id.button_register);
		
		
		//点击登录
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//在数据库中判断用户名和密码
				
				//跳转到游戏页面
				Intent intent= new Intent(Login.this,Main.class);
				startActivity(intent);
				
			}
		});
		
		//点击注册
		register.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//跳转到注册页面
				Intent intent= new Intent(Login.this,Register.class);
				startActivity(intent);
			}
		});


		
	}
}

