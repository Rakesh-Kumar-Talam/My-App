package com.example.myapp

import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DataAdapter: RecyclerView.Adapter<DataAdapter.DataViewHolder>() {

    var TAG = DataAdapter::class.java.simpleName

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        Log.i(TAG, "He brought a row plank -- He gave it to prateek")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class DataViewHolder(rowPlank:View):RecyclerView.ViewHolder(rowPlank) {
        init {
            Log.i(TAG, "prateek is trying to find the text view in the row")
        }
    }
}