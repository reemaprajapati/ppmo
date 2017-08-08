package com.example.otimus.ppmo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.otimus.ppmo.R;
import com.example.otimus.ppmo.model.Settings;

import java.util.List;


public class PreferencesItemAdapter extends BaseAdapter {

    Context context;
    List<Settings> list;
    public PreferencesItemAdapter(Context context, List<Settings> list){

        this.context=context;
        this.list=list;

    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(context).inflate(R.layout.item_preferences,null);

        TextView titleList=(TextView)view.findViewById(R.id.titleList);
        TextView descriptionList=(TextView)view.findViewById(R.id.descriptionList);


        titleList.setText(list.get(position).getTitle());
        descriptionList.setText(list.get(position).getDescription());

        return view;
    }
}
