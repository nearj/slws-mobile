package com.example.slws.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.slws.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    List<MyItem> myItemList;

    public MyAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.layout_card_item, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.img_icon.setImageResource(myItemList.get(i).getIcon());
        myViewHolder.txt_description.setText(myItemList.get(i).getText());
    }

    @Override
    public int getItemCount() {
        return myItemList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (myItemList.size() == 1)
            return 0;
        else {
            if (myItemList.size() % Common.NUM_OF_COLUMN == 0)
                return 1;
            else
                return (position > 1 && position == myItemList.size() - 1) ? 0 : 1;
        }
    }

    // Override getitemViewType

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img_icon;
        TextView txt_description;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_icon = itemView.findViewById(R.id.img_icon);
            txt_description = itemView.findViewById(R.id.txt_description);

        }
    }
}
