package com.lw.fragment.frag;

/**
 * Created by lw on 2017/2/15.
 */

public class Fragment1 extends BaseFragment {

    @Override
    public void init() {
        System.out.println("init1:"  + tv );
        tv.setText("Fragment1");
    }
}
