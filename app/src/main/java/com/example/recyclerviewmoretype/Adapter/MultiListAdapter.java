package com.example.recyclerviewmoretype.Adapter;


import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewmoretype.Factory.ItemHolderFactory;
import com.example.recyclerviewmoretype.Holder.ItemHolder;
import com.example.recyclerviewmoretype.Item.Item;

import java.util.List;


public class MultiListAdapter extends RecyclerView.Adapter<ItemHolder> {

    private List<Item> items;


    public MultiListAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return ItemHolderFactory.getItemHolder(viewGroup, i);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder itemHolder, int i) {
        itemHolder.setData(items.get(i));
        itemHolder.itemView.setTag(i);
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setSpanCount(GridLayoutManager gridLayoutManager) {
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i) {
                return getItemViewType(i);
            }
        });
    }

}
