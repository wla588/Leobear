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

	private TabHost tabHost;		//����TabHost����Ķ���
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //  setContentView(R.layout.daoku);
        
//        tabHost=(TabHost)findViewById(android.R.id.tabhost);	//��ȡTabHost����
//        tabHost.setup();	//��ʼ��TabHost���
        
        
        
        TabHost tabHost = getTabHost(); 
//        LayoutInflater.from(this).inflate(R.layout.tab1, tabHost.getTabContentView(), true); 
//        //TabHost tabHost = getTabHost(); 
//         LayoutInflater.from(this).inflate(R.layout.tab2, tabHost.getTabContentView(), true); 
        
//        LayoutInflater inflater = LayoutInflater.from(this); 	// ������ʵ����һ��LayoutInflater����  
//        inflater.inflate(R.layout.tab1, tabHost.getTabContentView());  
//        inflater.inflate(R.layout.tab2, tabHost.getTabContentView());
        
        tabHost.addTab(tabHost.newTabSpec("tab01")
        		.setIndicator("�����̳�")
        		
        		.setContent(new Intent(this,MyListView4.class)));   //��ӵ�һ����ǩҳ
        tabHost.addTab(tabHost.newTabSpec("tab02")
       		.setIndicator("�ҵĵ���")
        		.setContent(new Intent(this,MyListView5.class)));  	//��ӵڶ�����ǩҳ
        
       
        
       
        
        
    }
}
