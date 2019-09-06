package com.basket.myapplication.Retrofit

import retrofit2.Call
import retrofit2.http.GET

interface Query {
		@GET("users?page=2")
		fun verial(): Call<RetrofitModel>
}