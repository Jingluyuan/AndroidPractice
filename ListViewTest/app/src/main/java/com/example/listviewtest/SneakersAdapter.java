package com.example.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jingluyuan on 3/21/18.
 */

public class SneakersAdapter extends ArrayAdapter<Sneakers>{
    private int resourceId;

    public SneakersAdapter(Context context,int textViewResourceId,List<Sneakers> objects)
    {
        super(context,textViewResourceId,objects);
        this.resourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        Sneakers sneakers = getItem(position);
        View view ;
        ViewHolder viewHolder;
        if (convertView == null)
        {
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.sneakersImage = (ImageView) view.findViewById(R.id.sneakers_image);
            viewHolder.sneakersName = view.findViewById(R.id.sneakers_name);
            view.setTag(viewHolder);
        }else
        {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        /*ImageView sneakers_image = (ImageView) view.findViewById(R.id.sneakers_image);
        TextView sneakers_name = (TextView) view.findViewById(R.id.sneakers_name);*/
        viewHolder.sneakersImage.setImageResource(sneakers.getImageId());
        viewHolder.sneakersName.setText(sneakers.getName());
        return view;

    }
    class ViewHolder
    {
        ImageView sneakersImage;
        TextView sneakersName;
    }
}
