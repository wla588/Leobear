package com.mina.leobear;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RuleDialog extends Activity {

	private ImageView closeIt;
	private Intent intent;
	private Bundle bundle;
	private String mod;
	private int my_request=1560;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//intent = this.getIntent();
		//bundle = intent.getExtras();
		////mod = bundle.getString("model");
	//	if(mod=="zf"){
			setContentView(R.layout.rule);
		
			closeIt=(ImageView)findViewById(R.id.rule_quit);
			closeIt.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
				//	String model1="zf";
				//	Bundle bundle1 = new Bundle();
				//	bundle1.putString("model", model1);
					Intent intent = new Intent(RuleDialog.this,Choose.class);
				//	intent.putExtras(bundle1);
					startActivity(intent);
				}
			});
		}
/*		//else if(mod=="xl"){
			setContentView(R.layout.xialurule);
		
			closeIt=(ImageView)findViewById(R.id.rule_quit);
			closeIt.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					String model2="xl";
					Bundle bundle2 = new Bundle();
					bundle2.putString("model", model2);
					Intent intent = new Intent(RuleDialog.this,Choose.class);
					intent.putExtras(bundle2);
					startActivityForResult(intent, my_request);
			
				}
			});
		}
		else if(mod=="zz"){
			setContentView(R.layout.zhengzhanrule);
		
			closeIt=(ImageView)findViewById(R.id.rule_quit);
			closeIt.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					String model3="zz";
					Bundle bundle3 = new Bundle();
					bundle3.putString("model", model3);
					Intent intent = new Intent(RuleDialog.this,Choose.class);
					intent.putExtras(bundle3);
					startActivityForResult(intent, my_request);
			
				}
			});
		}
		
		
		
	}
*/	
}
