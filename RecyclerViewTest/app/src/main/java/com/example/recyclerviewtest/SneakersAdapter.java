package com.example.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jingluyuan on 3/21/18.
 */

public class SneakersAdapter extends RecyclerView.Adapter<SneakersAdapter.ViewHolder> {
    private List<Sneakers> msneakerslist;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView sneakersImage;
        TextView sneakersName;

        public ViewHolder(View view)
        {
            super(view);
            sneakersImage = (ImageView) view.findViewById(R.id.sneakers_image);
            sneakersName = (TextView) view.findViewById(R.id.sneakers_name);
        }
    }

    public SneakersAdapter(List<Sneakers> sneakersList)
    {
        msneakerslist = sneakersList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int type)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sneakers_item,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        Sneakers sneakers = msneakerslist.get(position);
        holder.sneakersName.setText(sneakers.getName());
        holder.sneakersImage.setImageResource(sneakers.getImageId());
    }

    @Override
    public int getItemCount()
    {
        return msneakerslist.size();
    }
}
