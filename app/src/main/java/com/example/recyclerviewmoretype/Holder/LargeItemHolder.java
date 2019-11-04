package com.example.recyclerviewmoretype.Holder;


import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

;import androidx.annotation.NonNull;

import com.example.recyclerviewmoretype.Item.Item;
import com.example.recyclerviewmoretype.Item.ItemLarge;
import com.example.recyclerviewmoretype.R;

public class LargeItemHolder extends ItemHolder {
    private ImageView imageView;
    private TextView mTitle,mSubTitle;
    public LargeItemHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.item_image);
        mTitle=itemView.findViewById(R.id.item_title);
        mSubTitle=itemView.findViewById(R.id.item_sub_title);
        itemView.setOnClickListener(onClickListener);
    }
    private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("123444",v.getTag()+"");
        }
    };
    @Override
    public void setData(Item itemdata) {
        ItemLarge item = (ItemLarge) itemdata;
        imageView.setImageBitmap(item.getBitmap());
        mTitle.setText(item.getmTitle());
        mSubTitle.setText(item.getmSubTitle());
    }


}
