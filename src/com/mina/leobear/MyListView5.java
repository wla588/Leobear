package com.mina.leobear;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MyListView5 extends ListActivity {

private List<Map<String, Object>> mData1;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mData1 = getData();
		MyAdapter adapter = new MyAdapter(this);
		setListAdapter(adapter);
	}

	private List<Map<String, Object>> getData() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "提示卡");
		map.put("number", "5");
		map.put("img", R.drawable.carddaoku);
		
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "巴西钻");
        map.put("number", "10");
		map.put("img", R.drawable.diamond);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "目前您的积分是");
        map.put("number", "500");
		map.put("img", R.drawable.coins);
		list.add(map);
		
		
		return list;
	}
	
	// ListView 中某项被选中后的逻辑
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		Log.v("MyListView5-click", (String)mData1.get(position).get("title"));
	 
	  
		  
	
	}
	
	/**
	 * listview中点击按键弹出对话框
	 */
	public void showInfo(){
		new AlertDialog.Builder(this)
		.setTitle("说明")
		.setMessage("您目前拥有的道具数量")
		.setPositiveButton("确定", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		})
		
		.show();
		
	}
	
	
	
	public final class ViewHolder{
		public ImageView img;
		public TextView title;
		public TextView number;
		public Button viewBtn;
	}
	
	
	public class MyAdapter extends BaseAdapter{

		private LayoutInflater mInflater;
		
		
		public MyAdapter(Context context){
			this.mInflater = LayoutInflater.from(context);
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return mData1.size();
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			ViewHolder holder = null;
			if (convertView == null) {
				
				holder=new ViewHolder();  
				
				convertView = mInflater.inflate(R.layout.tab2, null);
				holder.img = (ImageView)convertView.findViewById(R.id.img2);
				holder.title = (TextView)convertView.findViewById(R.id.title1);
				holder.number = (TextView)convertView.findViewById(R.id.number);
				
				holder.viewBtn = (Button)convertView.findViewById(R.id.button2);
				convertView.setTag(holder);
				
			}else {
				
				holder = (ViewHolder)convertView.getTag();
			}
			
			
			holder.img.setBackgroundResource((Integer)mData1.get(position).get("img"));
			holder.title.setText((String)mData1.get(position).get("title"));
			holder.number.setText((String)mData1.get(position).get("number"));
		
			holder.viewBtn.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					showInfo();					
				}
			});
			
			
			return convertView;
		}
		
	}}