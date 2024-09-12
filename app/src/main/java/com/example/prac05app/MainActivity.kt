package com.example.prac05app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.prac05app.listViewPage.ListViewActivity
import com.example.prac05app.recycleViewPage.RecycleActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnListView: Button = findViewById(R.id.btn_go_lv)
        val btnRecycleView: Button = findViewById(R.id.btn_go_rv)

        btnListView.setOnClickListener {
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }

        btnRecycleView.setOnClickListener {
            val intent = Intent(this, RecycleActivity::class.java)
            startActivity(intent)
        }

    }
}