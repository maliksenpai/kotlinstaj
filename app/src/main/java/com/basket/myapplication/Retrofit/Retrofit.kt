package com.basket.myapplication.Retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.basket.myapplication.R
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit : AppCompatActivity() {

		override fun onCreate(savedInstanceState: Bundle?) {
				super.onCreate(savedInstanceState)
				setContentView(R.layout.activity_retrofit)
				var recyclerview:RecyclerView=findViewById(R.id.liste)
				recyclerview.layoutManager=LinearLayoutManager(this)
				var liste:MutableList<Datum>
				RetrofitClient.getClient().create(Query::class.java).verial().enqueue(
						object : Call<RetrofitModel>, retrofit2.Callback<RetrofitModel> {
								override fun enqueue(callback: retrofit2.Callback<RetrofitModel>) {
										TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
								}

								override fun isExecuted(): Boolean {
										TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
								}

								override fun clone(): Call<RetrofitModel> {
										TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
								}

								override fun isCanceled(): Boolean {
										TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
								}

								override fun cancel() {
										TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
								}

								override fun execute(): Response<RetrofitModel> {
										TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
								}

								override fun request(): Request {
										TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
								}

								override fun onFailure(call: Call<RetrofitModel>, t: Throwable) {
								}

								override fun onResponse(call: Call<RetrofitModel>, response: Response<RetrofitModel>) {
									Log.d("gelen", response.body()?.data?.get(1)?.firstName)
										liste= (response.body()?.data as MutableList<Datum>?)!!
										Log.d("gelenn", liste?.get(1)?.firstName)
										recyclerview.adapter=Adaptor(liste)
										Log.d("gelennn", Adaptor(liste).itemCount.toString())
								}

						}
				)
		}

}


