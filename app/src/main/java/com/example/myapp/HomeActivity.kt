package com.example.myapp


import android.os.Bundle

import android.view.View
import android.widget.TextView

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.myapp.database.Item

import com.example.myapp.database.ItemDao
import com.example.myapp.database.ItemRoomDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity() {

    // lateinit var binding:ActivityHomeBinding

    lateinit var dao: ItemDao
    lateinit var tvhome: TextView
    //var count = 0
    lateinit var viewModel: HomeViewModel
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
        tvhome = findViewById(R.id.tvhome)

        viewModel = ViewModelProvider(this)[HomeViewModel::class.java]

        //tvhome.setText(""+viewModel.count)

        dao = database.itemDao()
        //tvhome.setText(""+ count)
    }

//    override fun onStart() {
//        super.onStart()
//    }

    fun insertDb(view: View) {

        GlobalScope.launch {
            val item = Item(777, "fruits", 111.0, 22)
            dao.insert(item)

        }

    }

    fun findItemDb(view: View) {
        GlobalScope.launch(Dispatchers.Main) {
            val item = dao.getItem(777).first()
            tvhome.setText(item.itemName)
        }
    }

    fun incrementCount(view: View) {
        viewModel.incrementCount()
        //count++
        tvhome.setText(""+viewModel.count)

        viewModel.startTimer()
        tvhome.setText(""+viewModel._seconds)
    }
}


