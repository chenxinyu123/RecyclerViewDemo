package com.example.recyclerviewmoretype.Item;

import android.graphics.Bitmap;

import com.example.recyclerviewmoretype.Factory.ItemHolderFactory;


public class ItemLarge implements Item {
    private Bitmap bitmap;
    private String mTitle,mSubTitle;

    public ItemLarge(Bitmap bitmap, String mTitle, String mSubTitle) {
        this.bitmap = bitmap;
        this.mTitle = mTitle;
        this.mSubTitle = mSubTitle;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmSubTitle() {
        return mSubTitle;
    }

    @Override
    public int getType() {
        return ItemHolderFactory.ITEM_LARGE;
    }
}
