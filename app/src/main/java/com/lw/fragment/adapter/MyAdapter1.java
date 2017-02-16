package com.lw.fragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;

import com.lw.fragment.frag.BaseFragment;

import java.util.List;

/**
 * Created by lw on 2017/2/15.
 */

public class MyAdapter1 extends FragmentPagerAdapter {

    private List<BaseFragment> fragments;

    private FragmentManager fm;
    private FragmentTransaction mCurTransaction;

    public MyAdapter1(FragmentManager fm, List<BaseFragment> fragments) {
        super(fm);
        this.fragments = fragments;
        this.fm = fm;
        List<Fragment> fragmentList = fm.getFragments();

        /*不行
        for (BaseFragment f : fragments) {
            fm.beginTransaction().detach(f);
        }*/
        /*不行：error
        for (BaseFragment f : fragments) {
            fm.beginTransaction().add(f,"HAHA" + f.toString()).commit();
        }*/
    }

    @Override
    public Fragment getItem(int position) {
        System.out.println("position:" + position);
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    /**不行
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        if (mCurTransaction == null) {
            mCurTransaction = fm.beginTransaction();
        }

        BaseFragment fragment = fragments.get(position);
        if (fragment != null) {
            mCurTransaction.attach(fragment);
        } else {
            fragment = (BaseFragment) getItem(position);
            mCurTransaction.add(container.getId(), fragment,
                    this.makeFragmentName(container.getId(), getItemId(position)));

        }
        // 系统已经commit
        return fragment;
    }
*/

    private static String makeFragmentName(int viewId, long id) {
        return "android:switcher:" + viewId + ":" + id;
    }
}
