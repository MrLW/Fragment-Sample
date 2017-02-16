package com.lw.fragment.frag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lw.fragment.R;

/**
 * Created by lw on 2017/2/16.
 */

public class ScreenFragment extends Fragment {

    private String arg = "无参构造器";

    public ScreenFragment() {
        System.out.println("ScreenFragment-----无参构造器");
    }

    public ScreenFragment(String arg) {
        this.arg = arg;
    }

    public static ScreenFragment newInstance(String arg) {
        Bundle bundle = new Bundle();
        bundle.putString("arg", arg);
        ScreenFragment fragment = new ScreenFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_screen, container, false);
        TextView tv = (TextView) view.findViewById(R.id.tv);
        tv.setText(arg);
//        tv.setText(getArguments().getString("arg"));
        return view;
    }



}
