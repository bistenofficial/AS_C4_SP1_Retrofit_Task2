package com.example.as_c4_sp1_retrofit_task2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonApi
{
    @GET("apod?api_key=h7gib0MogiVQqAA5jX6KejMTqZ6aEIyuKvMKXjxl&date=2020-12-12")//apod?api_key=h7gib0MogiVQqAA5jX6KejMTqZ6aEIyuKvMKXjxl&date=2020-12-12
    Call<APOD> getPosts();
}
