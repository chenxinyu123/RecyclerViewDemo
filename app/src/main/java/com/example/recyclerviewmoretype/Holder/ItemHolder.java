package com.example.recyclerviewmoretype.Holder;


import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewmoretype.Item.Item;


public abstract class ItemHolder extends RecyclerView.ViewHolder {
    public ItemHolder(@NonNull View itemView) {
        super(itemView);
    }
    public abstract void setData(Item itemdata);
}
