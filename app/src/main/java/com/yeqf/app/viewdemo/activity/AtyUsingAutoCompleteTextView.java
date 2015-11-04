package com.yeqf.app.viewdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import com.yeqf.app.viewdemo.R;

/**
 * Created by yeqf on 2015/11/2.
 */
public class AtyUsingAutoCompleteTextView extends Activity {

    private AutoCompleteTextView actv;
    private MultiAutoCompleteTextView mactv;
    private String[] astr = {
            "java",
            "javascript",
            "php",
            "python",
            "android",
            "android studio"
    };

    private ArrayAdapter<String> autoAdapter, mautoAdapte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_autocompletettextview);

        actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        autoAdapter = new ArrayAdapter<String>(this, R.layout.custom_dropdown_item, astr);
        actv.setAdapter(autoAdapter);

        mactv = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);
        mautoAdapte = new ArrayAdapter<String>(this, R.layout.custom_dropdown_item, astr);
        mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        mactv.setAdapter(mautoAdapte);

    }
}
