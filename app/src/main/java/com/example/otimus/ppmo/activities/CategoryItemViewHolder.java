package com.example.otimus.ppmo.activities;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.otimus.ppmo.R;

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
        Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}