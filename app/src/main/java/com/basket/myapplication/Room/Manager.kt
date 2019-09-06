package com.basket.myapplication.Room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [com.basket.myapplication.Room.Database::class],version = 1)
abstract class Manager: RoomDatabase() {
		abstract fun manager():dbinterface
		companion object{
				var Database:Manager?=null
				fun databasekur(context: Context): Manager? {
						if(Database==null){
								synchronized(Manager::class){
										Database= Room.databaseBuilder(context, Manager::class.java,"tablo").build()
								}
						}
						return Database
				}
		}
}