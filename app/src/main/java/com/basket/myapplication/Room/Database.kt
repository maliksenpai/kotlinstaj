package com.basket.myapplication.Room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "tablo")
data class Database(
		@PrimaryKey(autoGenerate = true) val db_id:Int?=0,
		@ColumnInfo(name = "isim") val db_isim:String?,
		@ColumnInfo(name = "soyisim") val db_soyisim:String?)
