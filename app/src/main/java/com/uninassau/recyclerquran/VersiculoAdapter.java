package com.uninassau.recyclerquran;


import android.view.LayoutInflater;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VersiculoAdapter extends RecyclerView.Adapter<VersiculoAdapter.ViewHolder>{

    private List<Versicle> verseDataSet;

    public VersiculoAdapter(List<Versicle> dataSet) {
        verseDataSet = dataSet;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private OnReceiveContentListener listener;
        private TextView textNumero;
        public TextView textVersiculo;
        public ViewHolder(View view) {
            super(view);

            textNumero = view.findViewById(R.id.textNumero);
            textVersiculo = view.findViewById(R.id.textVersiculo);

        }
    }

    @NonNull
    @Override
    public VersiculoAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_verse, viewGroup, false);

        return new VersiculoAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VersiculoAdapter.ViewHolder viewHolder, int position) {
        viewHolder.textNumero.setText(String.valueOf(verseDataSet.get(position).getVerse()));
        viewHolder.textVersiculo.setText(String.valueOf(verseDataSet.get(position).getText()));
    }

    @Override
    public int getItemCount() {
        return verseDataSet.size();
    }

}
