package com.demo.demo_icoderss.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.demo.demo_icoderss.R;
import com.demo.demo_icoderss.models.ResultItem;
import java.util.List;

public class IteamListAdapter extends RecyclerView.Adapter<IteamListAdapter.MyViewHolder> {
    private Context context;
    private List<ResultItem> list;

    public IteamListAdapter(Context context, List<ResultItem> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_menu, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ResultItem resultItem = list.get(position);
        holder.name.setText(resultItem.getMenuItemDetail().get(position).getItemName());
        holder.desc.setText(resultItem.getMenuItemDetail().get(position).getItemDescription());
        holder.price.setText(resultItem.getMenuItemDetail().get(position).getPrice());
//        holder.quantity.setText(resultItem.getMenuItemDetail().get(position).getQuantity());
//        Glide.with(context).load(resultItem.getMenuItemDetail().get(position).getImage())
//                .thumbnail(0.5f)
//                .diskCacheStrategy(DiskCacheStrategy.ALL)
//                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
         private ImageView image;
         private TextView name;
         private TextView desc;
         private TextView price;
         private TextView quantity;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_menu);
            name = itemView.findViewById(R.id.item_name);
            desc = itemView.findViewById(R.id.item_desc);
            price = itemView.findViewById(R.id.item_price);
            quantity = itemView.findViewById(R.id.item_quantity);
        }
    }
}
