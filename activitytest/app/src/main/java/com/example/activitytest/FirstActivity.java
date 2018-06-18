package com.example.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.add_item:
                Toast.makeText(this, "you click add item", Toast.LENGTH_SHORT).show();
                break;
            case  R.id.remove_item:
                Toast.makeText(this, "you click remove item", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode)
        {
            case 1:
                if (resultCode == RESULT_OK)
                {
                    String returndata = data.getStringExtra("return_data");
                    Log.d("First Activity",returndata);
                }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity","Task id is"+getTaskId());
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(FirstActivity.this, "You click button1", Toast.LENGTH_SHORT).show();
                //String data = "hello second activity";
                Intent intent = new Intent(FirstActivity.this,Second_Activity.class);
                //Intent intent = new Intent("com.example.activitytest.ACTION_START");
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //Intent intent = new Intent(Intent.ACTION_DIAL);
                //intent.setData(Uri.parse("tel:"));
               // intent.putExtra("extra_data",data);
                startActivity(intent);
                //startActivityForResult(intent, 1);
            }
        });

    }
}
