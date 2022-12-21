package com.uninassau.recyclerquran;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://cdn.jsdelivr.net/";
    @GET("gh/fawazahmed0/quran-api@1/editions/ben-muhiuddinkhan-lad.json")
    Call<Quran> getQuran();

}