package com.bwie.newstitlelihui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.newstitlelihui.R;

/**
 * 类的用途:
 *
 * @author 李辉
 * @date 2017/2/10 09:57.
 */

public class ContactFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contact, null);

        return view;
    }
}
