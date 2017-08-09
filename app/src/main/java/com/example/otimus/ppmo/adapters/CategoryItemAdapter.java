package com.example.otimus.ppmo.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.otimus.ppmo.R;
import com.example.otimus.ppmo.activities.CategoryItemViewHolder;
import com.example.otimus.ppmo.model.Category;

import java.util.List;

public class CategoryItemAdapter extends RecyclerView.Adapter<CategoryItemViewHolder> {

    private List<Category> itemList;
    private Context context;

    public CategoryItemAdapter(Context context, List<Category> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public CategoryItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_category, null);
        CategoryItemViewHolder rcv = new CategoryItemViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(CategoryItemViewHolder holder, int position) {
        holder.categoryName.setText(itemList.get(position).getTitle());
        holder.categoryImg.setImageResource(itemList.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
