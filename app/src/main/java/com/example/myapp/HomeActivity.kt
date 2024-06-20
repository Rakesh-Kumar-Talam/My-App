package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.R.id.activity_ex
import com.example.myapp.R.id.tvui

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var data = intent.extras?.getString("mykey")
        Log.i("HomeActivity","data is " +data)
        //Log.i("homeactivity",data)
        //var homeTextView:TextView = findViewById(activity_ex)
        //homeTextView.setText("data")
    }

    fun getShowText(view: View) {
        //get the text from the edui
        var Edui:EditText = findViewById(R.id.edui)
        var textEntered = Edui.text.toString()
        //show the text in tvui
        var Tvui: TextView = findViewById(R.id.tvui)
        Tvui.setText(textEntered)
    }
}