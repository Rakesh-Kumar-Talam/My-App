package com.example.myapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(var data: Array<String>) : RecyclerView.Adapter<DataAdapter.DataViewHolder>() {

    var TAG = DataAdapter::class.java.simpleName

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        Log.i(TAG, "He brought a row plank -- He gave it to prateek")
        var rowPlank = LayoutInflater.from(parent.context).inflate(R.layout.row_plank,parent,false) //he brought it
        return DataViewHolder(rowPlank) //he gave it to prateek
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(prateekholder: DataViewHolder, position: Int) {
        Log.i(TAG, "rakesh is writing on the text view-- " + data[position])
        prateekholder.tvRowItem.setText(data[position])
    }

    class DataViewHolder(rowPlank:View):RecyclerView.ViewHolder(rowPlank) {
        init {
            var TAG = DataAdapter::class.java.simpleName
            Log.i(TAG, "prateek is trying to find the text view in the row -- gave it to rakesh")
        }
        var tvRowItem = itemView.findViewById<TextView>(R.id.tvRow) // prattek finds the text view in the row
    }
}