package com.lw.fragment.frag;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lw on 2017/2/15.
 */

public abstract  class BaseFragment extends Fragment {

    public TextView tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tv = new TextView(container.getContext());
        tv.setTextSize(30f);
        tv.setTextColor(Color.BLACK);
        init();
        return tv;
    }


    public abstract void init() ;
}
