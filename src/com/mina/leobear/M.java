package com.mina.leobear;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;
import android.os.Build;

public class M extends Activity implements View.OnClickListener{
	private SeekBar sb;
	private int progressNum = 100;
	private Handler handler;
	private Button butt_sound;
	private int count = 0;
	private String[] press_text = new String[4];
	private TextImageButton[] press_button = new TextImageButton[4];
	private int imageButtonId[] = {R.id.imageButton11,R.id.imageButton12,R.id.imageButton13,R.id.imageButton14,
			                       R.id.imageButton21,R.id.imageButton22,R.id.imageButton23,R.id.imageButton24,
			                       R.id.imageButton31,R.id.imageButton32,R.id.imageButton33,R.id.imageButton34,
			                       R.id.imageButton41,R.id.imageButton42,R.id.imageButton43,R.id.imageButton44,
			                       R.id.imageButton51,R.id.imageButton52,R.id.imageButton53,R.id.imageButton54,
			                       R.id.imageButton61,R.id.imageButton62,R.id.imageButton63,R.id.imageButton64,
			                       R.id.imageButton71,R.id.imageButton72,R.id.imageButton73,R.id.imageButton74,
			                       R.id.imageButton81,R.id.imageButton82,R.id.imageButton83,R.id.imageButton84,
			                       R.id.imageButton91,R.id.imageButton92,R.id.imageButton93,R.id.imageButton94};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game_table);

		sb = (SeekBar)findViewById(R.id.seekBar1);
		for(int i=0;i<36;i++){
			
			final TextImageButton textImageButton = (TextImageButton)findViewById(imageButtonId[i]);
			//textImageButton.setNum(0);
			textImageButton.setText("中");
		    textImageButton.setColor(Color.WHITE);
		    textImageButton.setTextSize(15f);
		    textImageButton.setId(imageButtonId[i]);
		    textImageButton.setOnClickListener(new View.OnClickListener() {
				
				@SuppressLint("NewApi")
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					textImageButton.setNum(textImageButton.getNum()+1);
					if(textImageButton.getNum()%2==1){
						v.setAlpha(0.5f);						
						press_text[count] = textImageButton.getText();
						press_button[count] = textImageButton;
						count +=1;
						if(count==4){
							String chengyu = "";
							for(int i=0;i<press_text.length;i++){
								chengyu += press_text[i];								
							}
							if(chengyu.equals("中中中中")){
								for(int i=0;i<4;i++){
									press_button[i].setVisibility(View.INVISIBLE);
									press_button[i] =null;
									press_text[i] = "";
								}
								count=0;
							}
							Toast.makeText(M.this,chengyu+count, Toast.LENGTH_LONG).show();
						}
					}else if(textImageButton.getNum()%2==0){
						v.setAlpha(1);
						count -=1;
						press_text[count] = "";
						press_button[count] = null;
					}					
				}
			});
		}
		butt_sound = (Button)findViewById(R.id.butt_sound1);
		butt_sound.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(M.this, "音效", Toast.LENGTH_LONG).show();
			}
		});
		sb.setProgress(progressNum);
		handler = new Handler(){
			public void handleMessage(Message msg){
				if(msg.what==1){
					sb.setProgress(progressNum);  //更新进度
				}
			}
		};
		//创建一个线程
				new Thread(new Runnable(){

					@Override
					public void run() {
						// TODO Auto-generated method stub				
						while(true){
							progressNum--;//获取耗时操作完成的百分比
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							Message m = new Message();
							if(progressNum>0){
								m.what=1;
								handler.sendMessage(m);
							}else{
								m.what=2;
								handler.sendMessage(m);
								break;
							}
						}
					}
					
				}).start();//开启一个线程
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.m, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_m, container,
					false);
			return rootView;
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
