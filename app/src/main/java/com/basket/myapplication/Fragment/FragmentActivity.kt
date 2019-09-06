package com.basket.myapplication.Fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.basket.myapplication.R

class FragmentActivity : AppCompatActivity() {

		override fun onCreate(savedInstanceState: Bundle?) {
				super.onCreate(savedInstanceState)
				setContentView(R.layout.activity_fragment)
				findViewById<Button>(R.id.button).setOnClickListener {
						val fragment:Fragment= Fragment()
						fragment.show(supportFragmentManager,"asd")
				}
		}
}
