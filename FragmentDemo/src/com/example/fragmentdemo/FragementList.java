package com.example.fragmentdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class FragementList extends ListFragment {
	 private String[] values = new String[] { "侏儒", "人类", "暗夜精灵", "矮人", "德莱尼",  
     "狼人" };
	 private int[] images = new int[] { R.drawable.ic_launcher,  
	            R.drawable.ic_launcher, R.drawable.ic_launcher,  
	            R.drawable.ic_launcher, R.drawable.ic_launcher,  
	            R.drawable.ic_launcher };
	 //注意在onCreateView方法中使用inflater的inflate方法将布局页面引进：
//	 @Override
//	 public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
//	 {
//		return inflater.inflate(R.layout.frag_list,container,false);
//	 }
	 @Override  
	    public void onActivityCreated(Bundle savedInstanceState) {  
	        super.onActivityCreated(savedInstanceState);  
	  
	        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();  
	        for (int i = 0; i < values.length; i++) {  
	            Map<String, Object> listItem = new HashMap<String, Object>();  
	            listItem.put("values", values[i]);  
	            listItem.put("images", images[i]);  
	            listItems.add(listItem);  
	        }  
	        SimpleAdapter adapter = new SimpleAdapter(getActivity(), listItems,  
	                R.layout.list_item, new String[] { "values", "images" },  
	                new int[] { R.id.title, R.id.img });  
	        setListAdapter(adapter);  
	  
	    } 
	 
	 @Override  
	    public void onListItemClick(ListView l, View v, int position, long id) {  
	        // String item = (String) getListAdapter().getItem(position);  
	        FragementDetails frag = (FragementDetails) getFragmentManager()  
	                .findFragmentById(R.id.frag_detail);  
	        if (frag != null && frag.isInLayout()) {  
	            switch (position) {  
	            case 0:  
	                frag.setText(getString(R.string.Gnome));  
	                break;  
	            case 1:  
	                frag.setText(getString(R.string.Human));  
	                break;  
	            case 2:  
	                frag.setText(getString(R.string.NightElf));  
	                break;  
	            case 3:  
	                frag.setText(getString(R.string.Dwarf));  
	                break;  
	            case 4:  
	                frag.setText(getString(R.string.Draenei));  
	                break;  
	            case 5:  
	                frag.setText(getString(R.string.Werewolf));  
	                break;  
	            }  
	        }  
	  
	        Log.i("PDA", "position = " + position);  
	    }  
}
