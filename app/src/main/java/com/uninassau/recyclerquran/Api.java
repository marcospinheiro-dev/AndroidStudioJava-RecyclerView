package com.uninassau.recyclerquran;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

//    https://cdn.jsdelivr.net/gh/fawazahmed0/quran-api@1/editions/ben-muhiuddinkhan-lad.json

    String BASE_URL = "https://cdn.jsdelivr.net/";
    @GET("gh/fawazahmed0/quran-api@1/editions/ben-muhiuddinkhan-lad.json")
    Call<Quran> getsuperHeroes();

//    String BASE_URL = "https://hp-api.herokuapp.com/api/";
//    @GET("characters")
//    Call<List<Results>> getsuperHeroes();

}