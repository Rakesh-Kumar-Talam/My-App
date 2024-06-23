package com.example.myapp


import android.os.Bundle

import android.view.View

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.database.Item

import com.example.myapp.database.ItemDao
import com.example.myapp.database.ItemRoomDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {

    // lateinit var binding:ActivityHomeBinding

    lateinit var dao: ItemDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets*/

        // enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        var database = ItemRoomDatabase.getDatabase(this)
        dao = database.itemDao()
    }

    override fun onStart() {
        super.onStart()
    }

    fun insertDb(view: View) {

        GlobalScope.launch {
            val item = Item(777, "fruits", 111.0, 22)
            dao.insert(item)

        }

    }
}


