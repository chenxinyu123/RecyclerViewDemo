package com.example.recyclerviewmoretype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.example.recyclerviewmoretype.Adapter.MultiListAdapter;
import com.example.recyclerviewmoretype.Item.Item;
import com.example.recyclerviewmoretype.Item.ItemLarge;
import com.example.recyclerviewmoretype.Item.ItemSmall;
import com.example.recyclerviewmoretype.Item.ItemTitleBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Item> itemList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
        GridLayoutManager layoutManager = new GridLayoutManager(this, 6);
        MultiListAdapter adapter = new MultiListAdapter(itemList);
        adapter.setSpanCount(layoutManager);
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void initdata() {
        //添加数据
        itemList.add(new ItemTitleBar("Hot New", null));
        itemList.add(new ItemLarge(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_1),
                "One More Light",
                "Linkin Park"));
        itemList.add(new ItemLarge(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_2),
                "Let Go ",
                "Avril Lavigne"));
        itemList.add(new ItemTitleBar("Recommended", null));
        itemList.add(new ItemSmall(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_3),
                "Bridge to Terabithia"));
        itemList.add(new ItemSmall(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_4),
                "Life Is Beautiful"));
        itemList.add(new ItemSmall(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_5),
                "A Violent Flame"));
        itemList.add(new ItemTitleBar("Top Rated", null));
        itemList.add(new ItemLarge(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_6),
                "Furious image_7: Original Motion Picture Soundtrack",
                "Various Artists"));
        itemList.add(new ItemLarge(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_7),
                "Halo image_5: Guardians (Original Soundtrack)",
                "Kazuma Jinnouchi"));
        itemList.add(new ItemTitleBar("Hot New", null));
        itemList.add(new ItemLarge(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_1),
                "One More Light",
                "Linkin Park"));
        itemList.add(new ItemLarge(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_2),
                "Let Go ",
                "Avril Lavigne"));
        itemList.add(new ItemTitleBar("Recommended", null));
        itemList.add(new ItemSmall(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_3),
                "Bridge to Terabithia"));
        itemList.add(new ItemSmall(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_4),
                "Life Is Beautiful"));
        itemList.add(new ItemSmall(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_5),
                "A Violent Flame"));
        itemList.add(new ItemTitleBar("Top Rated", null));
        itemList.add(new ItemLarge(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_6),
                "Furious image_7: Original Motion Picture Soundtrack",
                "Various Artists"));
        itemList.add(new ItemLarge(
                BitmapFactory.decodeResource(getResources(), R.drawable.image_7),
                "Halo image_5: Guardians (Original Soundtrack)",
                "Kazuma Jinnouchi"));
    }
}
