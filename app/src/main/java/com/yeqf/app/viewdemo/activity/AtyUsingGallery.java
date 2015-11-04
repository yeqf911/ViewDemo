package com.yeqf.app.viewdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Gallery;

import com.yeqf.app.viewdemo.R;

/**
 * Created by yeqf on 2015/11/1.
 */
public class AtyUsingGallery extends Activity {

    private Gallery gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_gallery);
        gallery = (Gallery) findViewById(R.id.gallery);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        for (int i = 0; i < 10; i++) {
            adapter.add("item " + i);
        }
        gallery.setAdapter(adapter);
    }
}
