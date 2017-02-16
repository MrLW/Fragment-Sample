package com.lw.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager vp;

    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        vp = (ViewPager) findViewById(R.id.vp_pager);

        for (int i = 0; i < 4; i++) {
            list.add("aaa") ;
        }

        findViewById(R.id.btn_load)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        vp.setAdapter(new PagerAdapter() {
                            @Override
                            public int getCount() {
                                System.out.println("getCount");
                                return list.size();
                            }

                            @Override
                            public boolean isViewFromObject(View view, Object object) {

                                return view == object;
                            }

                            @Override
                            public void destroyItem(ViewGroup container, int position, Object object) {
                            }

                            @Override
                            public Object instantiateItem(ViewGroup container, int position) {
                                System.out.println("instantiateItem");
                                TextView tv = new TextView(getApplicationContext());
                                tv.setText(list.get(position)+ position);
                                tv.setTextColor(Color.BLACK);
                                container.addView(tv);
                                return tv;
                            }
                        });
                    }
                });
    }
}
