package com.example.achuan.animationtest_0;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends Activity{
	
	private ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_layout);
		listView=(ListView) findViewById(R.id.listView);//加载列表
		List<String>list=new ArrayList<String>();//创建集合存储列表数据
		for(int i=0;i<20;i++)
		{
			list.add("慕课网"+i);
		}
		//配置列表的数据适配器
		ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
	    listView.setAdapter(adapter);//为列表添加适配器
		//配置动画控制器中加载的动画
	    LayoutAnimationController lac=new LayoutAnimationController(AnimationUtils.loadAnimation(this, R.anim.zoom_in));
	    //设置显示的顺序：ORDER_NORMAL顺序显示、ORDER_REVERSE反显示、ORDER_RANDOM随机显示
		lac.setOrder(LayoutAnimationController.ORDER_NORMAL);
	    //将动画控制器负载到列表上
		listView.setLayoutAnimation(lac);
	    listView.startLayoutAnimation();//启动动画,每个item会按照设置的动画方式来加入到列表中
	}

}
