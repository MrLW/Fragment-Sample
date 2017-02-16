package com.lw.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lw.fragment.frag.ScreenFragment;

public class ScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        System.out.println("ScreenActivity:onCreate");
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fl_content, new ScreenFragment("我是参数")).commit();
//          getSupportFragmentManager().beginTransaction().add(R.id.fl_content, ScreenFragment.newInstance("我是参数")).commit();
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("ScreenActivity:onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("ScreenActivity:onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("ScreenActivity:onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("ScreenActivity:onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("ScreenActivity:onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("ScreenActivity:onRestart");
    }
}
