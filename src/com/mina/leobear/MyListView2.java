package com.mina.leobear;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mina.leobear.MyListView1.MyAdapter;
import com.mina.leobear.MyListView1.ViewHolder;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyListView2 extends ListActivity {

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
      for(int i =0;i<5;i++){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "����"+i);
		map.put("info", "����:100");
		map.put("img", R.drawable.pic1);
		list.add(map);
       }
		return list;
	}
	
	
			  
			  

	public void showInfo(){
		new AlertDialog.Builder(this)
		.setTitle("������Ϣ")
		.setMessage("���ĺ�����Ϣ��~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
		.setNegativeButton("�˽⿩~~~", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		})
		.show();
		
	}
	
	public void showInfo1(){
		new AlertDialog.Builder(this)
		.setTitle("ȷ����Ϣ")
		.setMessage("ȷ��Ҫɾ�������㣿��")
		.setNegativeButton("�㿩~~~", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		})
		.setPositiveButton("��Ȼ��~~~", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
				Toast.makeText(MyListView2.this, "�����Ѿ����Ǻ�������", Toast.LENGTH_SHORT).show();
			}
		})
		.show();
		
	}
	public void showInfo2(){
		new AlertDialog.Builder(this)
		.setTitle("ȷ����Ϣ")
		.setMessage("ȷ��ҪPK�����㣿��")
		.setNegativeButton("�㿩~~~", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		})
		.setPositiveButton("��Ȼ��~~~", new DialogInterface.OnClickListener() {
			
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
		public Button viewBtn;
		public Button pk;
		public Button delete;
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
				
				convertView = mInflater.inflate(R.layout.table2, null);
				holder.img = (ImageView)convertView.findViewById(R.id.ItemImage1);
				holder.title = (TextView)convertView.findViewById(R.id.ItemTitle1);
				holder.info = (TextView)convertView.findViewById(R.id.ItemText1);
				holder.viewBtn = (Button)convertView.findViewById(R.id.button1);
				holder.pk = (Button)convertView.findViewById(R.id.button3);
				holder.delete=(Button)convertView.findViewById(R.id.button2);
				convertView.setTag(holder);
				
			}else {
				
				holder = (ViewHolder)convertView.getTag();
			}
			
			
			holder.img.setBackgroundResource((Integer)mData.get(position).get("img"));
			holder.title.setText((String)mData.get(position).get("title"));
			holder.info.setText((String)mData.get(position).get("info"));
			holder.viewBtn.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					showInfo();					
				}
			});
             holder.pk.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					showInfo2();					
				}
			});
           holder.delete.setOnClickListener(new View.OnClickListener() {
	
	         @Override
	          public void onClick(View v) {
		      showInfo1();					
	         }
             });
			
			
			return convertView;
		}
		
	}
}
	
	