package com.bwie.newstitlelihui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.newstitlelihui.R;
import com.bwie.newstitlelihui.adapter.MyAdapter;

import java.util.ArrayList;

/**
 * 类的用途:
 *
 * @author 李辉
 * @date 2017/2/10 09:57.
 */

public class HomeFragment extends Fragment {

    private TabLayout titleTl;
    private ViewPager vp;
    String[] title = new String[]{
            "推荐", "热点", "社会", "美女写真", "视频", "娱乐", "朝闻天下", "今日说法", "焦点访谈"
    };
    ArrayList<Fragment> list = new ArrayList<Fragment>();
    private MyAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home, null);
        titleTl = (TabLayout) view.findViewById(R.id.tablayout_title);
        vp = (ViewPager) view.findViewById(R.id.vp);

        //添加fragment
        initFragment();

        //设置适配器
        MyAdapter adapter = new MyAdapter(getChildFragmentManager(), getActivity(), title, list);

        vp.setAdapter(adapter);
        titleTl.setupWithViewPager(vp);
        titleTl.setTabMode(TabLayout.MODE_SCROLLABLE);
        return view;
    }


    private void initFragment() {
        list.add(new HomeFragment());
        list.add(new ColleageFragment());
        list.add(new ContactFragment());
        list.add(new MyFragment());
        list.add(new HomeFragment());
        list.add(new ColleageFragment());
        list.add(new ContactFragment());
        list.add(new MyFragment());
        list.add(new MyFragment());

    }


}
