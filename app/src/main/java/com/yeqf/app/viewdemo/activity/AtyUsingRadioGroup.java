package com.yeqf.app.viewdemo.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.yeqf.app.viewdemo.R;

/**
 * Created by yeqf on 2015/10/30.
 */
public class AtyUsingRadioGroup extends Activity {

    private RadioButton radioButton;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_radiogroup);
        radioButton = (RadioButton) findViewById(R.id.radioRight);
        button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButton.isChecked()) {
                    new AlertDialog.Builder(AtyUsingRadioGroup.this)
                            .setTitle("判断").setMessage("回答正确").setPositiveButton("确定", null).show();
                } else {
                    new AlertDialog.Builder(AtyUsingRadioGroup.this)
                            .setTitle("判断").setMessage("回答错误").setPositiveButton("确定", null).show();
                }
            }
        });
    }
}
