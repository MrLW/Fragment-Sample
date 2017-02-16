package com.lw.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.lw.fragment.adapter.ListViewAdpter;

import java.util.ArrayList;
import java.util.List;


/**
 * ListView的setAdapter()机制和ViewPager不同
 * ListView：每次setAdapter都会调用getView
 */
public class ListViewActivity extends AppCompatActivity {

    private ListView lv;
    private List<String> list = new ArrayList<>();
    private Button btn_load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lv = (ListView) findViewById(R.id.lv);
        btn_load = (Button) findViewById(R.id.btn_load);
        list.add("xxx1");
        list.add("xxx2");
        list.add("xxx3");
        list.add("xxx4");
        list.add("xxx5");
        list.add("xxx6");
        list.add("xxx7");
        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lv.setAdapter(new ListViewAdpter(list));
            }
        });


    }
}
