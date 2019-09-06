package com.basket.myapplication.Retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
		companion object{
				fun getClient():Retrofit{
						return retrofit2.Retrofit
								.Builder()
								.baseUrl("https://reqres.in/api/")
								.addConverterFactory(GsonConverterFactory.create())
								.client(OkHttpClient())
								.build()
				}
		}
}