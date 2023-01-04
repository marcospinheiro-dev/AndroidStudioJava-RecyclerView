package com.uninassau.recyclerquran;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<Chapter> localDataSet;
    private Chapter binding;
    private OnItemClickListener myClickListener;

    public CustomAdapter(List<Chapter> dataSet, OnItemClickListener onItemClickListener) {
        localDataSet = dataSet;
        myClickListener = onItemClickListener;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView text1;

        public ViewHolder(View view) {
            super(view);
            text1 = view.findViewById(R.id.text1);
        }

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.text1.setText(String.valueOf(localDataSet.get(position).getNumber()));
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClickListener.onItemClick(localDataSet.get(position));
            }
        });
    }


    @Override
    public int getItemCount() {
        return localDataSet.size();
    }

}

