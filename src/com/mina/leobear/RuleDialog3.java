package com.mina.leobear;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RuleDialog3 extends Activity {

	private ImageView closeIt;
	//征战四方的游戏规则
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.zhengzhanrule);
		closeIt=(ImageView)findViewById(R.id.rule_quit3);
		closeIt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(RuleDialog3.this,Choose3.class);
				startActivity(intent);
			}
		});
	}
}
