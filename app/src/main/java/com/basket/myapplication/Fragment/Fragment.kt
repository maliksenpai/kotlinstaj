package com.basket.myapplication.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.basket.myapplication.R

class Fragment: DialogFragment() {
		override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
				val view:View=inflater.inflate(R.layout.fragment,null)
				view.findViewById<Button>(R.id.button2).setOnClickListener { dismiss() }
				return view
		}
}