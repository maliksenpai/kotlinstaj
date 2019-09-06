package com.basket.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.basket.myapplication.Fragment.FragmentActivity
import com.basket.myapplication.Retrofit.Retrofit
import com.basket.myapplication.Room.RoomActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
				findViewById<Button>(R.id.Glide).setOnClickListener {startActivity(Intent(this@MainActivity,Glide::class.java)) }
				findViewById<Button>(R.id.Bars).setOnClickListener { startActivity(Intent(this@MainActivity,Bars::class.java)) }
				findViewById<Button>(R.id.Retrofit).setOnClickListener { startActivity(Intent(this@MainActivity,Retrofit::class.java)) }
				findViewById<Button>(R.id.Dialog).setOnClickListener { startActivity(Intent(this@MainActivity,FragmentActivity::class.java)) }
				findViewById<Button>(R.id.Firebase).setOnClickListener { startActivity(Intent(this@MainActivity,Firebase::class.java)) }
				findViewById<Button>(R.id.Sqlite).setOnClickListener { startActivity(Intent(this@MainActivity,RoomActivity::class.java))}
    }
}
