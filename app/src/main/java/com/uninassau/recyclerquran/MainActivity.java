package com.uninassau.recyclerquran;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {

    private RecyclerView recyclerView;
    private CustomAdapter mAdapter;
    private OnItemClickListener myClickListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerView);

        makeRequest();

        this.myClickListener = this;
    }

    private void makeRequest() {
        //QURAN

        Call<Quran> call = RetrofitClient.getInstance().getMyApi().getQuran();
        call.enqueue(new Callback<Quran>() {
            @Override
            public void onResponse(Call<Quran> call, Response<Quran> response) {
                Quran quran = response.body();

                List<Chapter> chapters = quran.getChapters();
                mAdapter = new CustomAdapter(chapters, myClickListener);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(mLayoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<Quran> call, Throwable t) {

            }
        });
    }

    @Override
    public void onItemClick(Chapter item) {
        Intent i = new Intent(this, VersiculoActivity.class);
        i.putExtra("chapter", item);
        startActivity(i);
    }
}