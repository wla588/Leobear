package com.mina.leobear;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RuleDialog2 extends Activity {

	private ImageView closeIt;
	//狭路相逢的游戏规则
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xialurule);
		closeIt=(ImageView)findViewById(R.id.rule_quit2);
		closeIt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(RuleDialog2.this,Choose2.class);
				startActivity(intent);
			}
		});
	}
}
