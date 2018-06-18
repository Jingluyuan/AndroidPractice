package com.example.activitycycletest;

import android.content.Intent;
import android.nfc.Tag;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityCycleTestActivity extends AppCompatActivity {

    public static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreat");
        setContentView(R.layout.activitycycletest_layout);
        if (savedInstanceState != null)
        {
                String str = savedInstanceState.getString("data_key");
                Log.d(TAG,str);
        }
        Button startnormalactivity = (Button)findViewById(R.id.start_normal_activity);
        Button startdialogactivity = (Button)findViewById(R.id.start_dialog_activity);

        startnormalactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ActivityCycleTestActivity.this,NormalActivity.class);
                startActivity(intent1);
            }
        });

        startdialogactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ActivityCycleTestActivity.this,DialogActivity.class);
                startActivity(intent2);
            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        String tempdata = "temp data";
        outState.putString("data_key",tempdata);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }
}
