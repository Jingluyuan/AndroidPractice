package example.com.broadcastpractice;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button forceoffline = findViewById(R.id.force_offline);
        forceoffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("example.com.broadcastpractice.FOREC_OFFLINE");
                //intent.setComponent(new ComponentName("example.com.broadcastpractice","example.com.broadcastpractice.LoginActivity"));
                sendBroadcast(intent);
                Log.d("testtest","1111111111");
            }
        });
    }
}
 