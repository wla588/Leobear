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
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MyListView4 extends ListActivity {

private List<Map<String, Object>> mData;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mData = getData();
		MyAdapter adapter = new MyAdapter(this);
		setListAdapter(adapter);
	}

	private List<Map<String, Object>> getData() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "��ʾ��");
		map.put("info", "����10��");
		map.put("price","��Ҫ100��");
		map.put("bonus", "�޽���");
		map.put("img", R.drawable.carddaoku);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "������");
		map.put("info", "����10��");
		map.put("price", "��Ҫ100��");
		map.put("bonus", "�޽���");
		map.put("img", R.drawable.diamond);
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("title", "�ǻ���");
		map.put("info", "����50��");
		map.put("price", "��Ҫ500��");
		map.put("bonus", "����+40��");
		map.put("img", R.drawable.wisestar);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("title", "������");
		map.put("info", "��������");
	    map.put("price", "��Ҫ10000��");
	    map.put("bonus", "����+100��");
		map.put("img", R.drawable.daoku1);
		list.add(map);
		
		return list;
	}
	
	// ListView ��ĳ�ѡ�к���߼�
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		
		Log.v("MyListView4-click", (String)mData.get(position).get("title"));
		switch(position){
		  case 0:
			  new AlertDialog.Builder(this)
				.setTitle("��ʾ�����ܽ���")
				.setMessage("���԰��������ʾһ�������е���������")
				.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				})
//				.setNegativeButton("ȡ������", new DialogInterface.OnClickListener() {
//					
//					@Override
//					public void onClick(DialogInterface dialog, int which) {
//						// TODO Auto-generated method stub
//						dialog.dismiss();
//					}
//				})
				.show();
			  break;
		  case 1:
			  new AlertDialog.Builder(this)
				.setTitle("�����깦�ܽ���")
				.setMessage("���԰��������ʾһ������")
				.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				})
//				.setNegativeButton("ȡ������", new DialogInterface.OnClickListener() {
//					
//					@Override
//					public void onClick(DialogInterface dialog, int which) {
//						// TODO Auto-generated method stub
//						dialog.dismiss();
//					}
//				})
				.show();
			 // myalertDialog();
			  break;
		  case 2:
			  new AlertDialog.Builder(this)
				.setTitle("�ǻ��ǹ��ܽ���")
				.setMessage("���԰��������ʾһ�������е��������ֵ���ʾ��50�źͿ��԰��������ʾһ������İ�����50��")
				.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				})
//				.setNegativeButton("ȡ������", new DialogInterface.OnClickListener() {
//					
//					@Override
//					public void onClick(DialogInterface dialog, int which) {
//						// TODO Auto-generated method stub
//						dialog.dismiss();
//					}
//				})
				.show();
			  break;
		  case 3:
			  
			  new AlertDialog.Builder(this)
				.setTitle("�����繦�ܽ���")
				.setMessage("������ʾ���Ͱ��������������������")
				.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				})
//				.setNegativeButton("ȡ������", new DialogInterface.OnClickListener() {
//					
//					@Override
//					public void onClick(DialogInterface dialog, int which) {
//						// TODO Auto-generated method stub
//						dialog.dismiss();
//					}
//				})
				.show();
			  break;
		}
			  
			  
			  
	}
	
	/**
	 * listview�е�����������Ի���
	 */
	public void myalertDialog(){
		final AlertDialog dlg= new AlertDialog.Builder(this).create();
		dlg.show();
		Window  window =dlg.getWindow();
		window.setContentView(R.layout.myalertdialog);
		
		ImageButton ok=(ImageButton)window.findViewById(R.id.btn_ok);
		ok.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		ImageButton cancle =(ImageButton)window.findViewById(R.id.btn_cancel);
		cancle.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
	}
	public void showInfo(){
		new AlertDialog.Builder(this)
		.setTitle("�������")
		.setMessage("��ȴ��Ҫ�۵����ֹ��������")
		.setPositiveButton("ȷ������", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				//
			}
		})
		.setNegativeButton("ȡ������", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		})
		.show();
		
	}
	
	
	
	public final class ViewHolder{
		public ImageView img;
		public TextView title;
		public TextView info;
		public TextView price;
		public TextView bonus;
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
			return mData.size();
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
				
				convertView = mInflater.inflate(R.layout.tab1, null);
				holder.img = (ImageView)convertView.findViewById(R.id.img);
				holder.title = (TextView)convertView.findViewById(R.id.title);
				holder.info = (TextView)convertView.findViewById(R.id.info);
				holder.bonus=(TextView)convertView.findViewById(R.id.bonus);
				holder.price=(TextView)convertView.findViewById(R.id.price);
				holder.viewBtn = (Button)convertView.findViewById(R.id.view_btn);
				convertView.setTag(holder);
				
			}else {
				
				holder = (ViewHolder)convertView.getTag();
			}
			
			
			holder.img.setBackgroundResource((Integer)mData.get(position).get("img"));
			holder.title.setText((String)mData.get(position).get("title"));
			holder.info.setText((String)mData.get(position).get("info"));
			holder.bonus.setText((String)mData.get(position).get("bonus"));
			holder.price.setText((String)mData.get(position).get("price"));
			holder.viewBtn.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					showInfo();					
				}
			});
			
			
			return convertView;
		}
		
	}
	
	
	
	
}

