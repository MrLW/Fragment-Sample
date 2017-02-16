package com.lw.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.lw.fragment.adapter.MyAdapter1;
import com.lw.fragment.frag.BaseFragment;
import com.lw.fragment.frag.Fragment1;
import com.lw.fragment.frag.Fragment2;
import com.lw.fragment.frag.Fragment3;
import com.lw.fragment.view.LazyViewPager;

import java.util.ArrayList;
import java.util.List;

public class FragmentPagerActivity extends AppCompatActivity {

    private LazyViewPager vp_pager;
    private Button btn_load;
    private List<BaseFragment> fragments = new ArrayList<>();
    private MyAdapter1 adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_pager);
        btn_load = (Button) findViewById(R.id.btn_load);
        vp_pager = (LazyViewPager) findViewById(R.id.vp_pager);

        fragments.add(new Fragment1());// 注意：并不是在new的时候就走了生命周期的方法
        fragments.add(new Fragment2());
        fragments.add(new Fragment3());
        adapter1 = new MyAdapter1(getSupportFragmentManager(), fragments);

        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 注意：setAdapter()方法只会在第一次调用的时候才会起作用
                vp_pager.setAdapter(adapter1);
            }
        });

        findViewById(R.id.btn_reload).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter1.notifyDataSetChanged(); // 无效
            }
        });

    }
}
