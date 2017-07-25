package com.example.otimus.ppmo.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.otimus.ppmo.R;
import com.example.otimus.ppmo.model.TenderItem;

import java.util.List;

/**
 * Created by Otimus on 7/25/2017.
 */

public class TenderItemAdapter extends RecyclerView.Adapter<TenderItemAdapter.TenderViewHolder>{
    List<TenderItem> tenderItems;
    private final OnItemClickListener listener;
    Context context;

    public TenderItemAdapter(Context context,List<TenderItem> tenderItems,  OnItemClickListener listener) {
        this.tenderItems = tenderItems;
        this.listener = listener;
        this.context=context;
    }
    public interface OnItemClickListener{
        void onItemClick(TenderItem item);
    }

    @Override
    public TenderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tender,parent,false);

        return new TenderViewHolder(itemView);    }

    @Override
    public void onBindViewHolder(TenderViewHolder holder, int position) {
        holder.bind(tenderItems.get(position),listener);

        holder.ifd_no.setText(tenderItems.get(position).getIfdNo());
        holder.bid_title.setText(tenderItems.get(position).getBidTitle());
        holder.publish_date.setText(tenderItems.get(position).getPublishedDate());
        holder.days_left.setText(tenderItems.get(position).getDaysLeft());
        Log.d("output1",tenderItems.get(position).getBidTitle());

    }

    @Override
    public int getItemCount() {
        return tenderItems.size();    }

    public class TenderViewHolder extends RecyclerView.ViewHolder {
        TextView ifd_no,bid_title,publish_date,days_left;



        public TenderViewHolder(View itemView) {
            super(itemView);
            ifd_no= (TextView) itemView.findViewById(R.id.ifd_no);
            bid_title=(TextView)itemView.findViewById(R.id.bide_title);
            publish_date=(TextView) itemView.findViewById(R.id.published_date);
            days_left=(TextView)itemView.findViewById(R.id.days_left);

        }
        public void bind(final TenderItem item, final OnItemClickListener listener){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(item);

                }
            });
        }
    }
}




