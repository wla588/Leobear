package com.mina.leobear;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class DaokuActivity extends TabActivity {

	private TabHost tabHost;		//声明TabHost组件的对象
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //  setContentView(R.layout.daoku);
        
//        tabHost=(TabHost)findViewById(android.R.id.tabhost);	//获取TabHost对象
//        tabHost.setup();	//初始化TabHost组件
        
        
        
        TabHost tabHost = getTabHost(); 
//        LayoutInflater.from(this).inflate(R.layout.tab1, tabHost.getTabContentView(), true); 
//        //TabHost tabHost = getTabHost(); 
//         LayoutInflater.from(this).inflate(R.layout.tab2, tabHost.getTabContentView(), true); 
        
//        LayoutInflater inflater = LayoutInflater.from(this); 	// 声明并实例化一个LayoutInflater对象  
//        inflater.inflate(R.layout.tab1, tabHost.getTabContentView());  
//        inflater.inflate(R.layout.tab2, tabHost.getTabContentView());
        
        tabHost.addTab(tabHost.newTabSpec("tab01")
        		.setIndicator("道具商城")
        		
        		.setContent(new Intent(this,MyListView4.class)));   //添加第一个标签页
        tabHost.addTab(tabHost.newTabSpec("tab02")
       		.setIndicator("我的道具")
        		.setContent(new Intent(this,MyListView5.class)));  	//添加第二个标签页
        
       
        
       
        
        
    }
}
