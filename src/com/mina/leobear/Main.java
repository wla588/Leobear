package com.mina.leobear;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class Main extends Activity {

	private ImageView zf;
	private ImageView xl;
	private ImageView zz;
	private int my_request=1550;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.model);

		zf=(ImageView)findViewById(R.id.zhengfen);
		//第三种按钮
		zf.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
		
				Intent intent = new Intent(Main.this,RuleDialog.class);
			//	Bundle bundle = new Bundle();
			//	bundle.putString("model", model1);
			//	intent.putExtras(bundle);
				startActivity(intent);
			}
		});		
		
		xl=(ImageView)findViewById(R.id.xialu);
		//第三种按钮
		xl.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
		
			//	String model2="xl";
			////	Bundle bundle2 = new Bundle();
			//	bundle2.putString("model", model2);
				Intent intent = new Intent(Main.this,RuleDialog2.class);
			//	intent.putExtras(bundle2);
				startActivityForResult(intent, my_request);
			}
		});	
		
		zz=(ImageView)findViewById(R.id.zhengzhan);
		//第三种按钮
		zz.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
		
			//	String model3="zz";
			//	Bundle bundle3 = new Bundle();
			//	bundle3.putString("model", model3);
				Intent intent = new Intent(Main.this,RuleDialog3.class);
			//	intent.putExtras(bundle3);
				startActivity(intent);
			}
		});	

	}

	
	
	
}
