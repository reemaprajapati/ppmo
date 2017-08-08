package com.example.otimus.ppmo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.otimus.ppmo.R;
import com.example.otimus.ppmo.model.Category;

import java.util.List;
import java.util.Locale;


public class CategoryItemAdapter extends BaseAdapter {

    Context context;
   // private  final onItemClickListener listener;
    List<Category> list;

    public CategoryItemAdapter(Context context,List<Category> list) {
        this.context=context;
        this.list=list;
       // this.listener=listener;

    }

//    public interface OnItemClickListener{
//        void onItemClick(Category category);
//    }



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
        view= LayoutInflater.from(context).inflate(R.layout.item_category,null);
        ImageView img=(ImageView)view.findViewById(R.id.img);
        TextView title=(TextView)view.findViewById(R.id.title);
        img.setImageResource(list.get(position).getImg());
        title.setText(list.get(position).getTitle());

        return view;
    }


}

