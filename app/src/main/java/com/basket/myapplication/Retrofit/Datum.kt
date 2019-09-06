package com.basket.myapplication.Retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Datum {
		data class Datum(val firstName:String,val lastName:String)
		@SerializedName("id")
		@Expose
		var id: Int? = null
		@SerializedName("email")
		@Expose
		var email: String? = null
		@SerializedName("first_name")
		@Expose
		var firstName: String? = null
		@SerializedName("last_name")
		@Expose
		var lastName: String? = null
		@SerializedName("avatar")
		@Expose
		var avatar: String? = null

}
