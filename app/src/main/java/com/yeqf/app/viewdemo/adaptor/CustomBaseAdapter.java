package com.yeqf.app.viewdemo.adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yeqf on 2015/11/1.
 */
public abstract class CustomBaseAdapter<T> extends BaseAdapter {

    private List<T> listData = new ArrayList<>();
    private Context context;
    private int resId = 0;

    public CustomBaseAdapter(Context context, int resouseId) {
        this.context = context;
        this.resId = resouseId;
    }

    public Context getContext() {
        return context;
    }

    public void remove(int position) {
        if (getCount() > 0) {
            listData.remove(position);
        }
        notifyDataSetChanged();
    }

    public void add(T item) {
        listData.add(item);
        notifyDataSetChanged();
    }

    public void removeLast() {
        remove(getCount() - 1);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public T getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(resId, null);
        }
        initView(position, convertView, parent);
        return convertView;
    }

    protected abstract void initView(int position, View listView, ViewGroup parent);

}
