package com.example.recyclerviewmoretype.Holder;


import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.recyclerviewmoretype.Item.Item;
import com.example.recyclerviewmoretype.Item.ItemSmall;
import com.example.recyclerviewmoretype.R;


public class SamllItemHolder extends ItemHolder {
    private ImageView imageView;
    private TextView mTitle;
    public SamllItemHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.item_image1);
        mTitle=itemView.findViewById(R.id.item_title1);
        itemView.setOnClickListener(onClickListener);
    }

    @Override
    public void setData(Item itemdata) {
        ItemSmall item = (ItemSmall) itemdata;
        imageView.setImageBitmap(item.getBitmap());
        mTitle.setText(item.getmTitle());
    }
    private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("123444",v.getTag()+"");
        }
    };
}
