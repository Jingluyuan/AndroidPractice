package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Second_Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SecondActivity","Task id is"+getTaskId());
        setContentView(R.layout.second_layout);
       // Intent intent = getIntent();
        //String data = intent.getStringExtra("extra_data");
        //Log.d("Second_Activity",data);
        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(Second_Activity.this, "You click button2", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Second_Activity.this,ThirdActivity.class);
                /*intent1.putExtra("return_data","hello first avtivity");
                setResult(RESULT_OK,intent1);
                finish();*/
                startActivity(intent1);

            }
        });
    }
}
