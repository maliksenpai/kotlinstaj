package com.basket.myapplication.Retrofit

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.basket.myapplication.R
import kotlinx.android.synthetic.main.recyclerview.view.*

class Adaptor(val liste:MutableList<Datum>): RecyclerView.Adapter<Adaptor.ViewHolder>() {
		override fun onBindViewHolder(holder: ViewHolder, position: Int) {
					holder.textView.setText(liste[position].firstName)
					holder.textView2.setText(liste[position].lastName)
				Log.d("gelennn","asda")
			}

		override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
				val view=LayoutInflater.from(parent.context).inflate(R.layout.recyclerview,parent,false)
				return ViewHolder(view)
		}

		override fun getItemCount(): Int {
				return liste.size
		}

		class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
			//	var textView: TextView=itemView.findViewById(R.id.textView5)
			//	var textView2: TextView=itemView.findViewById(R.id.textView4)
				val textView=itemView.textView4
				val textView2=itemView.textView5
		}

}