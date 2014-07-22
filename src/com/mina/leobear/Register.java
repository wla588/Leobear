package com.mina.leobear;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends Activity {
	
	private EditText username;
	private EditText email;
	private EditText password;
	private EditText passwordtwice;
	private Button button_register;
	
	String usernamestr;
	String emailstr;
	String passwordstr;
	String passwordtwicestr;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//���ر�����
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_register);
		
		username=(EditText)this.findViewById(R.id.register_username);
		email=(EditText)this.findViewById(R.id.register_email);
		password=(EditText)this.findViewById(R.id.register_password);
		passwordtwice=(EditText)this.findViewById(R.id.register_passwordtwice);
		button_register=(Button)this.findViewById(R.id.button_register);
		
		usernamestr=username.getText().toString();
		emailstr=email.getText().toString();
		passwordstr=password.getText().toString();
		passwordtwicestr=passwordtwice.getText().toString();
		
		button_register.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(passwordstr.equals(passwordtwicestr)){
					//��ͬ
				}else{
					//����ͬ������ʾ
					//Toast.makeText(this, "Deleted Successfully!", Toast.LENGTH_LONG).show(); Ч�����£�
					Toast.makeText(Register.this, "������������벻һ�£�", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		
	}
}
	  

