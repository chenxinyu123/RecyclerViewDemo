package com.example.recyclerviewmoretype.Item;

import android.graphics.Bitmap;

import com.example.recyclerviewmoretype.Factory.ItemHolderFactory;


public class ItemSmall implements Item {
    private Bitmap bitmap;
    private String mTitle;

    public ItemSmall(Bitmap bitmap, String mTitle) {
        this.bitmap = bitmap;
        this.mTitle = mTitle;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public String getmTitle() {
        return mTitle;
    }

    @Override
    public int getType() {
        return ItemHolderFactory.ITEM_SMALL;
    }
}
