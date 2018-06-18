package example.com.materialtest;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by jingluyuan on 6/9/18.
 */

public class SneakerAdapter extends RecyclerView.Adapter<SneakerAdapter.ViewHolder> {
    private Context mContext;
    private List<Sneaker> mSneakerList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView sneakerImage;
        TextView sneakerName;
        public ViewHolder(View view){
            super(view);
            cardView = (CardView) view;
            sneakerImage =  view.findViewById(R.id.sneaker_image);
            sneakerName = view.findViewById(R.id.sneaker_name);
        }
    }

    public SneakerAdapter(List<Sneaker> sneakerList){
        mSneakerList = sneakerList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mContext == null){
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.sneaker_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Sneaker sneaker = mSneakerList.get(position);
        holder.sneakerName.setText(sneaker.getName());
        Glide.with(mContext).load(sneaker.getImagId()).into(holder.sneakerImage);

    }

    @Override
    public int getItemCount() {
        return mSneakerList.size();
    }
}
