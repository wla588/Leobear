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
        	public TabHost tabHost;		//����TabHost����Ķ���
        	@Override
        	public void onCreate(Bundle savedInstanceState) {
        		super.onCreate(savedInstanceState);
        		//����ȫ��
        		this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        		//���ر�����
        		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        		//tabHost=(TabHost)findViewById(android.R.id.tabhost);	//��ȡTabHost����
        		//tabHost.setup(this.getLocalActivityManager());
        		//tabHost.setup();
        			//��ʼ��TabHost���
        		//LayoutInflater inflater = LayoutInflater.from(this); 	// ������ʵ����һ��LayoutInflater����  
                //inflater.inflate(R.layout.table1, tabHost.getTabContentView());  
                //inflater.inflate(R.layout.table2, tabHost.getTabContentView());
        		
        	     tabHost.addTab(tabHost.newTabSpec("tab01")
                  		.setIndicator("���Ѹ���",getResources().getDrawable(R.drawable.test))
                  		.setContent(new Intent(this,MyListView1.class)));   //��ӵ�һ����ǩҳ
        	             getTabHost().setCurrentTab(0); 
                 tabHost.addTab(tabHost.newTabSpec("tab02")
                  		.setIndicator("������",getResources().getDrawable(R.drawable.test))
                  		.setContent(new Intent(this,MyListView2.class)));  	//��ӵڶ�����ǩҳ
 
                
                // ��Layout���ListView   
                //ListView list = (ListView) findViewById(R.id.listView1);  
               // ListView list1 = (ListView)findViewById(R.id.listView2);
          
                // ���ɶ�̬���飬��������   
                /*ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();  
                for (int i = 0; i < 5; i++) {  
                    // HashMapΪ��ֵ�����͡���һ������Ϊ�����ڶ�������Ϊֵ   
                    HashMap<String, Object> map = new HashMap<String, Object>();  
                    map.put("ItemImage", R.drawable.pic);// ͼ����ԴͼƬ����ʾ��С���Ҷ�   
                    map.put("ItemTitle","���"+i);  
                    map.put("ItemText", "����");  
                    map.put("button2","��Ϊ����" );
                    listItem.add(map);// ��ӵ�listItem��   
                }  
                */
                /*ArrayList<HashMap<String, Object>> listItem1 = new ArrayList<HashMap<String, Object>>();  
                for (int i = 0; i < 5; i++) {   
                    // HashMapΪ��ֵ�����͡���һ������Ϊ�����ڶ�������Ϊֵ   
                    HashMap<String, Object> map1 = new HashMap<String, Object>();  
                    map1.put("ItemImage1", R.drawable.pic1);// ͼ����ԴͼƬ����ʾ��С���Ҷ�   
                    map1.put("ItemTitle1","���"+i);  
                    map1.put("ItemText1", "����");  
                    map1.put("button1", "PK");
                    map1.put("button2","������" );
                    map1.put("button3", "�鿴��Ϣ");
                    listItem1.add(map1);// ��ӵ�listItem��  
                    
                }  
                // ������������Item�Ͷ�̬�����Ӧ��Ԫ�أ�������SimpleAdapter��ΪListView������Դ   
                // �����Ŀ���ֱȽϸ��ӣ����Լ̳�BaseAdapter�������Լ�������Դ��   
                // ����һ��SimpleAdapter���͵ı������������   
                /*SimpleAdapter listItemAdapter = new SimpleAdapter(  
                        this,// this�ǵ�ǰActivity�Ķ���   
                        listItem,// ����Դ Ϊ������ݺ��ArrayList���͵Ķ���     
                        R.layout.table1_item,// ����Ĳ���.xml�ļ���   
                        new String[] { "ItemImage", "ItemTitle", "ItemText","button2"},  
                        //���String�����е�Ԫ�ؾ���list�����е��У�list���м���������о�Ҫд���С�                         
                        new int[] {R.id.ItemImage, R.id.ItemTitle, R.id.ItemText,R.id.button2});//ֵ�Ƕ�ӦXML�����ļ��е�һ��ImageView,����TextView��id   
                */
                /*SimpleAdapter listItemAdapter1 = new SimpleAdapter(  
                        this,// this�ǵ�ǰActivity�Ķ���   
                        listItem1,// ����Դ Ϊ������ݺ��ArrayList���͵Ķ���     
                        R.layout.table2_item,// ����Ĳ���.xml�ļ���   
                        new String[] { "ItemImage1", "ItemTitle1", "ItemText1","button1","button2","button3"},  
                        //���String�����е�Ԫ�ؾ���list�����е��У�list���м���������о�Ҫд���С�                         
                        new int[] {R.id.ItemImage1, R.id.ItemTitle1, R.id.ItemText1,R.id.button1,R.id.button2,R.id.button3});//ֵ�Ƕ�ӦXML�����ļ��е�һ��ImageView,����TextView��id    
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
        				.setTitle("��ܰ��ʾ")
        				.setMessage("�����Ϣ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
        						+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
        						+ "~~~~~~~~~~~~~~~~~~~~~")
        				.setNegativeButton("�õ�ѽ~������ѡ���ְ�~", null);
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
