package com.basket.myapplication.Room

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.basket.myapplication.R

class RoomActivity : AppCompatActivity() {

		override fun onCreate(savedInstanceState: Bundle?) {
				super.onCreate(savedInstanceState)
				setContentView(R.layout.activity_room)
				val database: Database = Database(2, "enes", "acun")
				var db: Manager? = Manager.databasekur(this)
				AsyncTask.execute {
						db?.manager()?.yaz(Database(2,"enes","acun"))
						var liste: List<Database>? = db?.manager()?.hepsinial()
						Log.d("gelen", liste?.get(0)?.db_isim)
				}
		}
}
