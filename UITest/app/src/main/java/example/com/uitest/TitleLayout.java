package example.com.uitest;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.jar.Attributes;

/**
 * Created by jingluyuan on 3/20/18.
 */

public class TitleLayout extends LinearLayout{
    public TitleLayout(Context context, AttributeSet attr)
    {
        super(context,attr);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button titleback = (Button) findViewById(R.id.title_back);
        Button titleedit = (Button) findViewById(R.id.title_edit);

        titleback.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity) getContext()).finish();
            }
        });

        titleedit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"you click edit button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
