package com.example.fragmentdemo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragementDetails extends Fragment {
	@Override  
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  
            Bundle savedInstanceState) {  
        // TODO Auto-generated method stub  
        return inflater.inflate(R.layout.frag_detail, container,false);  
    }  
      
    public void setText(String item){  
        TextView txt = (TextView) getView().findViewById(R.id.txt_detail);  
        txt.setText(item);  
    }  
}
