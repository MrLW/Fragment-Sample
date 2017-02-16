package com.lw.fragment.frag.backstack;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lw.fragment.R;

public class FragmentTwo extends Fragment {

    private Button btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        System.out.println("container:" + container);
        View view = inflater.inflate(R.layout.fragment_fragment_two, container, false);
        btn = (Button) view.findViewById(R.id.btn_back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentThree fragmentThree = new FragmentThree();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.hide(FragmentTwo.this);// 隐藏第二个Fragment
                ft.add(R.id.id_content, fragmentThree, "THREE");
                ft.addToBackStack(null);
                ft.commit();// 提交
            }
        });
        return view;
    }
}
