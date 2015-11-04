package com.yeqf.app.viewdemo.activity;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

import com.yeqf.app.viewdemo.R;

/**
 * Created by yeqf on 2015/10/31.
 */
public class AtyUsingTimePicker extends Activity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_using_timepicker);
        button = (Button) findViewById(R.id.timePicker);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TimePickerDialog(AtyUsingTimePicker.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        button.setText(String.format("%d:%d", hourOfDay, minute));
                    }
                }, 14, 22, true).show();
            }
        });
    }
}
