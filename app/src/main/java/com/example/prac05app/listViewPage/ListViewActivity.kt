package com.example.prac05app.listViewPage

import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.prac05app.R
import com.example.prac05app.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listView = findViewById<ListView>(R.id.lv)

        val stringList = arrayListOf<String>()

        for(i in 1..30){
            stringList.add("menu$i")
        }

        val adapter: ArrayAdapter<*>

        adapter = ArrayAdapter(
            this,
            R.layout.list_item,
            R.id.tv,
            stringList
        )

        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val clickedItem = stringList[position]
            Toast.makeText(this, "click $clickedItem", Toast.LENGTH_SHORT).show()
        }

    }

}