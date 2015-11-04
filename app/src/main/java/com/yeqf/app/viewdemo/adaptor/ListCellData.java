package com.yeqf.app.viewdemo.adaptor;

import android.content.Context;
import android.content.Intent;

/**
 * Created by yeqf on 2015/10/30.
 */
public class ListCellData {
    private String controlName = "";
    private Context context = null;
    private Intent intent = null;

    public ListCellData(Context context, String controlName, Intent intent) {
        this.context = context;
        this.controlName = controlName;
        this.intent = intent;
    }

    public String getControlName() {
        return controlName;
    }

    public Context getContext() {
        return context;
    }

    public Intent getIntent() {
        return intent;
    }

    public void startActivity() {
        getContext().startActivity(intent);
    }

    @Override
    public String toString() {
        return controlName;
    }
}
