package com.yeqf.app.viewdemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yeqf.app.viewdemo.R;

/**
 * Created by yeqf on 2015/11/1.
 */
public class AtyUsingBaseAdapter extends Activity implements View.OnClickListener {

    private Button startStringAdapter;
    private Button startImageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_baseadapter);

        startStringAdapter = (Button) findViewById(R.id.stringAdapter);
        startImageAdapter = (Button) findViewById(R.id.imageAdapter);
        startImageAdapter.setOnClickListener(this);
        startStringAdapter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.stringAdapter:
                Intent intentString = new Intent(this, StringListView.class);
                startActivity(intentString);
                break;
            case R.id.imageAdapter:
                Intent intentImage = new Intent(this, ImageListView.class);
                startActivity(intentImage);
                break;
        }
    }
}
