package com.example.fragmenttest;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.*;
import android.os.Bundle;

/**
 * Created by jingluyuan on 3/21/18.
 */

public class RightFragment extends Fragment {
    private static final String TAG = "RightFragment";

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
        Log.d(TAG,"onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState)
    {
        Log.d(TAG,"onCreateView");
        View view = layoutInflater.inflate(R.layout.right_fragment,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG,"onActivityCreated");
    }

    @Override
    public void onStart()
    {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    public void onResume()
    {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    public void onStop()
    {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        Log.d(TAG,"onDestroyView");
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
        Log.d(TAG,"onDetach");
    }
}
