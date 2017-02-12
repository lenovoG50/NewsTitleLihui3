package com.bwie.newstitlelihui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bwie.newstitlelihui.fragment.ColleageFragment;
import com.bwie.newstitlelihui.fragment.ContactFragment;
import com.bwie.newstitlelihui.fragment.HomeFragment;
import com.bwie.newstitlelihui.fragment.MyFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout fragment;
    private ArrayList<Fragment> list;
    private FragmentTransaction transaction;
    private ArrayList<TextView> tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment = (LinearLayout) findViewById(R.id.fragment);

        TextView home = (TextView) findViewById(R.id.home);
        home.setOnClickListener(this);
        TextView contact = (TextView) findViewById(R.id.contact);
        contact.setOnClickListener(this);
        TextView colleage = (TextView) findViewById(R.id.colleage);
        colleage.setOnClickListener(this);
        TextView my = (TextView) findViewById(R.id.my);
        my.setOnClickListener(this);

        list = new ArrayList<Fragment>();
        list.add(new HomeFragment());
        list.add(new ContactFragment());
        list.add(new ColleageFragment());
        list.add(new MyFragment());

        tv = new ArrayList<>();
        tv.add(home);
        tv.add(contact);
        tv.add(colleage);
        tv.add(my);

        selectFragment(0);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.home:
                selectFragment(0);
                selectTvColor(0);
                break;
            case R.id.contact:
                selectFragment(1);
                selectTvColor(1);
                break;
            case R.id.colleage:
                selectFragment(2);
                selectTvColor(2);
                break;
            case R.id.my:
                selectFragment(3);
                selectTvColor(3);
                break;
        }
    }

    private void selectTvColor(int i) {

        for (int j = 0; j < tv.size(); j++) {
            if (j == i) {
                tv.get(j).setTextColor(Color.RED);
            } else {
                tv.get(j).setTextColor(Color.BLACK);
            }
        }
    }

    private void selectFragment(int i) {
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment, list.get(i));
        transaction.commit();
    }


}
