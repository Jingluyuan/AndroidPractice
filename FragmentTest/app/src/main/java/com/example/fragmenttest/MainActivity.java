package com.example.fragmenttest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                switch (view.getId())
//                {
//                    case R.id.button:
//                        replaceFragment(new AnotherRightFragment());
//                        break;
//                    default:
//                        break;
//                }
            }
        });
        //replaceFragment(new RightFragment());

    }
//    private void replaceFragment(Fragment fragment)
//    {
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.right_layout,fragment);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//    }

}
