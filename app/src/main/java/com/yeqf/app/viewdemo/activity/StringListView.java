package com.yeqf.app.viewdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.yeqf.app.viewdemo.R;
import com.yeqf.app.viewdemo.adaptor.CustomBaseAdapter;

/**
 * Created by yeqf on 2015/11/1.
 */
public class StringListView extends Activity implements View.OnClickListener {

    private Button addItem;
    private Button removeItem;
    private ListView listView;
    private CustomBaseAdapter adapter;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_listview);
        addItem = (Button) findViewById(R.id.addItem);
        removeItem = (Button) findViewById(R.id.removeItem);
        listView = (ListView) findViewById(R.id.stringListView);

        addItem.setOnClickListener(this);
        removeItem.setOnClickListener(this);
        adapter = new CustomBaseAdapter(this, android.R.layout.simple_list_item_1) {
            @Override
            protected void initView(int position, View listView, ViewGroup parent) {
                ((TextView) (listView)).setText(getItem(position) + "");
            }
        };

        for (index = 0; index < 10; index++) {
            adapter.add("item " + index);
        }

        listView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addItem:
                adapter.add("item " + ++index);
                break;
            case R.id.removeItem:
                adapter.removeLast();
                break;
        }
    }
}
