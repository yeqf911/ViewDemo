package com.yeqf.app.viewdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.yeqf.app.viewdemo.R;
import com.yeqf.app.viewdemo.adaptor.ImageAdapter;

/**
 * Created by yeqf on 2015/10/31.
 */
public class AtyUsingGridView extends Activity {

    private GridView gridView;
    private ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_gridview);
        gridView = (GridView) findViewById(R.id.gridView);

        //adapter = ArrayAdapter.createFromResource(this, R.array.spinner_array, android.R.layout.simple_gallery_item);
        /*adapter = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_list_item_1);
        for (int i = 0; i < 62; i++) {
            adapter.add("fuck" + i);
        }*/
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(AtyUsingGridView.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
