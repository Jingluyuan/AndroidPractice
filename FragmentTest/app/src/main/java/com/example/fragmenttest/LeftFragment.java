package com.example.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jingluyuan on 3/21/18.
 */

public class LeftFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = layoutInflater.inflate(R.layout.left_fragment,container,false);
        return view;
    }
}
