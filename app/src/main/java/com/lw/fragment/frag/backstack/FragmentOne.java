package com.lw.fragment.frag.backstack;

import android.content.Context;
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

public class FragmentOne extends Fragment {

    private Button btn;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        System.out.println("FragmentOne:onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("FragmentOne:onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        System.out.println("FragmentOne:onCreateView");
        System.out.println("container:" + container);
        View view = inflater.inflate(R.layout.fragment_fragment_one, container, false);
        btn = (Button) view.findViewById(R.id.btn_back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTwo fragmentTwo = new FragmentTwo();
                FragmentManager fm = FragmentOne.this.getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.id_content, fragmentTwo, "TWO");
                // 将第一个Fragment添加到回退栈
                // FragmentOne实例不会被销毁，但是视图层会被销毁，也就是调用了onDestoryView和onCreateView方法，
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("FragmentOne:onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("FragmentOne:onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println("FragmentOne:onDetach");
    }
}
