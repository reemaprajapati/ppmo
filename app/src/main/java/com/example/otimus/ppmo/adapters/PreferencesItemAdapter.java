package com.example.otimus.ppmo.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.otimus.ppmo.R;
import com.example.otimus.ppmo.activities.NotificationItemViewHolder;
import com.example.otimus.ppmo.model.Settings;

import java.util.List;

public class PreferencesItemAdapter extends RecyclerView.Adapter<NotificationItemViewHolder> {

    private List<Settings> itemList;
    private Context context;

    public PreferencesItemAdapter(Context context, List<Settings> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public NotificationItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_notification, null);
        NotificationItemViewHolder rcv = new NotificationItemViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(NotificationItemViewHolder holder, int position) {
        holder.nTitle.setText(itemList.get(position).getTitle());
        holder.nDescription.setText(itemList.get(position).getDescription());
    }



    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}