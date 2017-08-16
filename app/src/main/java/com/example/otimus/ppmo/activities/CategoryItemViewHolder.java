package com.example.otimus.ppmo.activities;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.otimus.ppmo.R;
import com.example.otimus.ppmo.fragments.FragmentGoods;

public class CategoryItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView categoryName;
    public ImageView categoryImg;

    public CategoryItemViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        categoryName = (TextView)itemView.findViewById(R.id.category_name);
        categoryImg = (ImageView)itemView.findViewById(R.id.category_img);
    }

    @Override
    public void onClick(View view) {

    }
}