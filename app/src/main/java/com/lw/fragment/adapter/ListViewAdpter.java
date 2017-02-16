package com.lw.fragment.adapter;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lw on 2017/2/15.
 */

public class ListViewAdpter extends BaseAdapter {

    private List<String> list;

    public ListViewAdpter(List<String> list) {
        this.list = list;
    }

    /**
     * 每次setAdapter都会调用
     * @return
     */
    @Override
    public int getCount() {
        System.out.println("getCount:");
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        System.out.println("getView");
        TextView tv = new TextView(parent.getContext());
        tv.setText(list.get(position));
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(18f);
        return tv;
    }
}
