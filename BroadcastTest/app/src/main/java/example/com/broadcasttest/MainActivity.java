package example.com.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private IntentFilter intentFilter;
    private IntentFilter intentFilter1;
    private NetworkChangeReceiver networkChangeReceiver;
    private LocalReceiver localReceiver;
    private LocalBroadcastManager localBroadcastManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        localBroadcastManager = LocalBroadcastManager.getInstance(this);
        Button button = findViewById(R.id.send_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Toast.makeText(view.getContext(),"haha",Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent("example.com.broadcasttest.MY_BROADCAST");
                Intent intent1 = new Intent("example.com.broadcasttest.MY_BROADCAST");
//               intent1.setComponent(new ComponentName("example.com.broadcasttest","example.com.broadcasttest.MyBroadcastReceiver"));
                intent1.setComponent(new ComponentName("example.com.broadcasttest2","example.com.broadcasttest2.AnotherBroadcastReceiver"));
//                sendOrderedBroadcast(intent,null);
                sendOrderedBroadcast(intent1,null);
                Intent intent = new Intent("example.com.broadcasttest.LOCAL_BROADCAST");
                localBroadcastManager.sendBroadcast(intent);

            }
        });
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        networkChangeReceiver = new NetworkChangeReceiver();
        registerReceiver(networkChangeReceiver,intentFilter);
        intentFilter1 = new IntentFilter();
        intentFilter1.addAction("example.com.broadcasttest.LOCAL_BROADCAST");
        localReceiver = new LocalReceiver();
        localBroadcastManager.registerReceiver(localReceiver,intentFilter1);

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(networkChangeReceiver);
    }

    class NetworkChangeReceiver extends BroadcastReceiver
    {
        @Override
        public void onReceive(Context context, Intent intent)
        {
//            Toast.makeText(context,"network changes",Toast.LENGTH_SHORT).show();
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isAvailable())
            {
                Toast.makeText(context,"network is available",Toast.LENGTH_SHORT).show();
            }else
            {
                Toast.makeText(context,"network is not available",Toast.LENGTH_SHORT).show();
            }


        }
    }

    class LocalReceiver extends BroadcastReceiver
    {

        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context,"received local broadcast",Toast.LENGTH_SHORT).show();
        }
    }


}
