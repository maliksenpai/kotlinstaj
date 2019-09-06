package com.basket.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class Glide : AppCompatActivity() {

		override fun onCreate(savedInstanceState: Bundle?) {
				super.onCreate(savedInstanceState)
				setContentView(R.layout.activity_glide)
				val resim:ImageView=findViewById(R.id.imageView)
				Glide.with(this).load(R.drawable.ic_launcher_background).into(resim)
		}
}
