package com.uninassau.recyclerquran;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VersiculoActivity extends AppCompatActivity {

    private RecyclerView recyclerViewVerse;
    private VersiculoAdapter mAdapter;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_versiculo);

//        recyclerViewVerse = findViewById(R.id.RecyclerView);

//        mAdapter = new VersiculoAdapter(new List<Versicle>());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewVerse.setLayoutManager(mLayoutManager);
        recyclerViewVerse.setItemAnimator(new DefaultItemAnimator());
        recyclerViewVerse.setAdapter(mAdapter);
    }


}