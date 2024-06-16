package com.example.myapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun Mybutton(view: View) {

        Log.i("MainActivity", "Mybutton: button clicked")
        var dail:Intent = Intent(Intent.ACTION_DIAL,Uri.parse("tel:7981036722"))
        startActivity(dail)
    }

    fun Website(view: View) {
        var web:Intent = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"))
        startActivity(web)
    }

    fun Activity_Example(view: View) {
        var hIntent:Intent = Intent(this,HomeActivity::class.java)
        startActivity(hIntent)
    }
}