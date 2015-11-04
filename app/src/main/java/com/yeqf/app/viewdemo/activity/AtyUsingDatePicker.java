package com.yeqf.app.viewdemo.activity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.yeqf.app.viewdemo.R;

/**
 * Created by yeqf on 2015/10/31.
 */
public class AtyUsingDatePicker extends Activity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_datepicker);
        button = (Button) findViewById(R.id.datePicker);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(AtyUsingDatePicker.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        button.setText(String.format("%d:%d:%d", year, monthOfYear, dayOfMonth));
                    }
                }, 2015, 10, 31).show();
            }
        });
    }
}
