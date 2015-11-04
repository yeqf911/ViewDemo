package com.yeqf.app.viewdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.yeqf.app.viewdemo.R;
import com.yeqf.app.viewdemo.adaptor.CustomBaseAdapter;
import com.yeqf.app.viewdemo.adaptor.ImageItem;

/**
 * Created by yeqf on 2015/11/1.
 */
public class ImageListView extends Activity {

    private ListView listView;
    private CustomBaseAdapter<ImageItem> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_listview);
        listView = (ListView) findViewById(R.id.imageListView);
        adapter = new CustomBaseAdapter<ImageItem>(this, R.layout.image_item) {

            @Override
            protected void initView(int position, View listView, ViewGroup parent) {
                ImageView imageView = (ImageView) listView.findViewById(R.id.imageView);
                TextView textView = (TextView) listView.findViewById(R.id.textView);
                ImageItem item = getItem(position);
                imageView.setImageResource(item.getImageRes());
                textView.setText(item.getDescription());
            }
        };

        adapter.add(new ImageItem(R.drawable.sample_0, "珊瑚"));
        adapter.add(new ImageItem(R.drawable.sample_1, "杀生丸"));
        adapter.add(new ImageItem(R.drawable.sample_2, "犬夜叉"));
        adapter.add(new ImageItem(R.drawable.sample_3, "戈薇"));
        adapter.add(new ImageItem(R.drawable.sample_4, "桔梗"));


        listView.setAdapter(adapter);
    }
}

