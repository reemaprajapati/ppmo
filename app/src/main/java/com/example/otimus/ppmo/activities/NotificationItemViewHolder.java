package com.example.otimus.ppmo.activities;


import android.support.v7.widget.RecyclerView;
import android.view.View;

import android.widget.TextView;
import android.widget.Toast;

import com.example.otimus.ppmo.R;

import org.w3c.dom.Text;

public class NotificationItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView nTitle;
    public TextView nDescription;

    public NotificationItemViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        nTitle = (TextView) itemView.findViewById(R.id.titleList);
        nDescription = (TextView) itemView.findViewById(R.id.descriptionList);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}