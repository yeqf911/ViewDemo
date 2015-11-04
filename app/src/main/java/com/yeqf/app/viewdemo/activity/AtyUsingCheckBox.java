package com.yeqf.app.viewdemo.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.yeqf.app.viewdemo.R;

/**
 * Created by yeqf on 2015/10/30.
 */
public class AtyUsingCheckBox extends Activity {

    private CheckBox cbshi, cbxiang, cbdabian, cbshit;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_checkbox);
        cbshi = (CheckBox) findViewById(R.id.shi);
        cbxiang = (CheckBox) findViewById(R.id.xiang);
        cbdabian = (CheckBox) findViewById(R.id.dabian);
        cbshit = (CheckBox) findViewById(R.id.shit);
        button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = "中午你将吃一下食物: \n";
                if (cbshi.isChecked()) {
                    content += "屎 \t";
                }
                if (cbxiang.isChecked()) {
                    content += "翔 \t";
                }
                if (cbdabian.isChecked()) {
                    content += "大便 \t";
                }
                if (cbshit.isChecked()) {
                    content += "Shit \t" + cbshit.getText();
                }

                new AlertDialog.Builder(AtyUsingCheckBox.this)
                        .setTitle("午餐信息").setMessage(content).setPositiveButton("确定", null).show();
            }
        });
    }
}
