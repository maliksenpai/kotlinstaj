package com.basket.myapplication.Room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
@Dao
interface dbinterface {
		@Query("Select * from tablo")
		fun hepsinial():List<Database>

		@Insert()
		fun yaz(database: Database)
}