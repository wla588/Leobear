package com.mina.leobear;

import java.util.HashMap;

import android.support.v4.app.Fragment;
import android.app.Activity;
import android.app.ActivityGroup;
import android.app.AlertDialog;
import android.app.TabActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TabHost;

        public class MainActivity extends TabActivity {
        	public TabHost tabHost;		//声明TabHost组件的对象
        	@Override
        	public void onCreate(Bundle savedInstanceState) {
        		super.onCreate(savedInstanceState);
        		//设置全屏
        		this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        		//隐藏标题栏
        		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        		//tabHost=(TabHost)findViewById(android.R.id.tabhost);	//获取TabHost对象
        		//tabHost.setup(this.getLocalActivityManager());
        		//tabHost.setup();
        			//初始化TabHost组件
        		//LayoutInflater inflater = LayoutInflater.from(this); 	// 声明并实例化一个LayoutInflater对象  
                //inflater.inflate(R.layout.table1, tabHost.getTabContentView());  
                //inflater.inflate(R.layout.table2, tabHost.getTabContentView());
        		
        	     tabHost.addTab(tabHost.newTabSpec("tab01")
                  		.setIndicator("搜搜附近",getResources().getDrawable(R.drawable.test))
                  		.setContent(new Intent(this,MyListView1.class)));   //添加第一个标签页
        	             getTabHost().setCurrentTab(0); 
                 tabHost.addTab(tabHost.newTabSpec("tab02")
                  		.setIndicator("好盆友",getResources().getDrawable(R.drawable.test))
                  		.setContent(new Intent(this,MyListView2.class)));  	//添加第二个标签页
 
                
                // 绑定Layout里的ListView   
                //ListView list = (ListView) findViewById(R.id.listView1);  
               // ListView list1 = (ListView)findViewById(R.id.listView2);
          
                // 生成动态数组，加入数据   
                /*ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();  
                for (int i = 0; i < 5; i++) {  
                    // HashMap为键值对类型。第一个参数为键，第二个参数为值   
                    HashMap<String, Object> map = new HashMap<String, Object>();  
                    map.put("ItemImage", R.drawable.pic);// 图像资源图片，显示在小项右端   
                    map.put("ItemTitle","玩家"+i);  
                    map.put("ItemText", "分数");  
                    map.put("button2","加为好友" );
                    listItem.add(map);// 添加到listItem中   
                }  
                */
                /*ArrayList<HashMap<String, Object>> listItem1 = new ArrayList<HashMap<String, Object>>();  
                for (int i = 0; i < 5; i++) {   
                    // HashMap为键值对类型。第一个参数为键，第二个参数为值   
                    HashMap<String, Object> map1 = new HashMap<String, Object>();  
                    map1.put("ItemImage1", R.drawable.pic1);// 图像资源图片，显示在小项右端   
                    map1.put("ItemTitle1","玩家"+i);  
                    map1.put("ItemText1", "分数");  
                    map1.put("button1", "PK");
                    map1.put("button2","送星星" );
                    map1.put("button3", "查看信息");
                    listItem1.add(map1);// 添加到listItem中  
                    
                }  
                // 生成适配器的Item和动态数组对应的元素，这里用SimpleAdapter作为ListView的数据源   
                // 如果条目布局比较复杂，可以继承BaseAdapter来定义自己的数据源。   
                // 生成一个SimpleAdapter类型的变量来填充数据   
                /*SimpleAdapter listItemAdapter = new SimpleAdapter(  
                        this,// this是当前Activity的对象   
                        listItem,// 数据源 为填充数据后的ArrayList类型的对象     
                        R.layout.table1_item,// 子项的布局.xml文件名   
                        new String[] { "ItemImage", "ItemTitle", "ItemText","button2"},  
                        //这个String数组中的元素就是list对象中的列，list中有几这个数组中就要写几列。                         
                        new int[] {R.id.ItemImage, R.id.ItemTitle, R.id.ItemText,R.id.button2});//值是对应XML布局文件中的一个ImageView,三个TextView的id   
                */
                /*SimpleAdapter listItemAdapter1 = new SimpleAdapter(  
                        this,// this是当前Activity的对象   
                        listItem1,// 数据源 为填充数据后的ArrayList类型的对象     
                        R.layout.table2_item,// 子项的布局.xml文件名   
                        new String[] { "ItemImage1", "ItemTitle1", "ItemText1","button1","button2","button3"},  
                        //这个String数组中的元素就是list对象中的列，list中有几这个数组中就要写几列。                         
                        new int[] {R.id.ItemImage1, R.id.ItemTitle1, R.id.ItemText1,R.id.button1,R.id.button2,R.id.button3});//值是对应XML布局文件中的一个ImageView,三个TextView的id    
                */   
               // list.setAdapter(listItemAdapter);     
                //list1.setAdapter(listItemAdapter1);  
                /*
                Button btn = (Button)findViewById(R.id.back);
                btn.setOnClickListener(new OnClickListener() {
        			
        			@Override
        			public void onClick(View v) {
        				Intent intent = new Intent(MainActivity.this,MainActivity.class);
        				startActivity(intent);
        			}
        		});
                */
                //Task_list_single_item_adapter s = new Task_list_single_item_adapter(MainActivity.this,listItem1);
              /*  LayoutInflater inflater1=LayoutInflater.from(MainActivity.this);
			    View buttonEntryView=inflater1.inflate(R.layout.table2_item, null);
				Button btn3 = (Button)buttonEntryView.findViewById(R.id.button3);
                btn3.setOnClickListener(new OnClickListener() {
        			@Override
        			public void onClick(View v) {
        				new AlertDialog.Builder(MainActivity.this)
        				.setIcon(R.drawable.p)
        				.setTitle("温馨提示")
        				.setMessage("玩家信息~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
        						+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
        						+ "~~~~~~~~~~~~~~~~~~~~~")
        				.setNegativeButton("好的呀~返回挑选对手吧~", null);
        				Log.i("jdklajifegn", "djflieajf");
        			}
        		});
                
                */
                
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
