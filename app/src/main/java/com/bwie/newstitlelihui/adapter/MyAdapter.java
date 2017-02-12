package com.bwie.newstitlelihui.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 类的用途:
 *
 * @author 李辉
 * @date 2017/2/11 14:45.
 */
public class MyAdapter extends FragmentPagerAdapter {

    private Context context;
    private String[] title;
    private List<Fragment> list;

    public MyAdapter(FragmentManager childFragmentManager, FragmentActivity activity, String[] title, List<Fragment> list) {
        super(childFragmentManager);
        context = activity;
        this.title = title;
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
