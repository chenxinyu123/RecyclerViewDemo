package com.example.recyclerviewmoretype.Holder;


import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;


import com.example.recyclerviewmoretype.Item.Item;
import com.example.recyclerviewmoretype.Item.ItemTitleBar;
import com.example.recyclerviewmoretype.R;


public class TitleBarItemHolder extends ItemHolder {
    private TextView title_bar, more;

    public TitleBarItemHolder(@NonNull View itemView) {
        super(itemView);
        title_bar = itemView.findViewById(R.id.title_bar);
        more = itemView.findViewById(R.id.more);
        itemView.setOnClickListener(onClickListener);
    }

    @Override
    public void setData(Item itemdata) {
        ItemTitleBar item = (ItemTitleBar) itemdata;
        title_bar.setText(item.getmTitle());
        more.setText(item.getmMore());
    }
    private View.OnClickListener onClickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d("123444",v.getTag()+"");
        }
    };
}
