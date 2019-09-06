package com.basket.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.*

class Firebase : AppCompatActivity() {

		override fun onCreate(savedInstanceState: Bundle?) {
				super.onCreate(savedInstanceState)
				setContentView(R.layout.activity_firebase)
				val reference:DatabaseReference=FirebaseDatabase.getInstance().getReference()
				val deneme="asd"
				reference.setValue(deneme)
				reference.push()
				val listener=object :ValueEventListener{
						override fun onDataChange(p0: DataSnapshot) {
								Log.d("asda", p0.getValue().toString())
						}

						override fun onCancelled(p0: DatabaseError) {
								Log.d("asda",p0.message)
						}
				}
				reference.addValueEventListener(listener)
		}
}

