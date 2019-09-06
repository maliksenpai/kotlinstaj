package com.basket.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class Bars : AppCompatActivity() {

		override fun onCreate(savedInstanceState: Bundle?) {
				super.onCreate(savedInstanceState)
				setContentView(R.layout.activity_bars)
				setSupportActionBar(findViewById(R.id.toolbar))
				supportActionBar?.setDisplayHomeAsUpEnabled(true)
				val listener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
						when (item.itemId) {
								R.id.bottom1 -> {
										Log.d("gelen","birinci")
										return@OnNavigationItemSelectedListener true
								}
								R.id.bottom2 -> {
										Log.d("gelen","ikinci")
										return@OnNavigationItemSelectedListener true
								}
						}
						false
				}
				findViewById<BottomNavigationView>(R.id.bottombar).setOnNavigationItemSelectedListener {
						if(it.itemId==R.id.bottom1){
								Log.d("gelen","birinci")
						}else if(it.itemId==R.id.bottom2){
								Log.d("gelen","ikinci")
						}else{
								Log.d("gelen","hata")
						}
						false
				}
		}

		override fun onCreateOptionsMenu(menu: Menu?): Boolean {
			menuInflater.inflate(R.menu.topbar,menu)
				return true
		}
		override fun onOptionsItemSelected(item: MenuItem): Boolean {
				Toast.makeText(this, item.itemId.toString(), Toast.LENGTH_SHORT).show()
				return super.onOptionsItemSelected(item)
		}
}
