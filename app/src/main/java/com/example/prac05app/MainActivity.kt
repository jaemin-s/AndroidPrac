package com.example.prac05app

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
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

        //ListView
//        var listView: ListView = findViewById(R.id.lv)
//
//        val dummyArray = arrayOf("캘린더", "템플릿", "휴지통", "도움말과 지원")
//
//        val arrayAdapter: ArrayAdapter<*>
//
//        arrayAdapter = ArrayAdapter(
//            this,
//            R.layout.list_item,
//            R.id.tv,
//            dummyArray
//        )
//
//        listView.adapter = arrayAdapter

        //RecyclerView
//        val recyclerView: RecyclerView = findViewById(R.id.rv)
//        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//
//        var menuList: ArrayList<MenuModel> = arrayListOf(
//            MenuModel("Menu1"),
//            MenuModel("Menu2"),
//            MenuModel("Menu3"),
//            MenuModel("Menu4"),
//            MenuModel("Menu1"),
//            MenuModel("Menu2"),
//            MenuModel("Menu3"),
//            MenuModel("Menu4"),
//            MenuModel("Menu1"),
//            MenuModel("Menu2"),
//            MenuModel("Menu3"),
//            MenuModel("Menu4"),
//            MenuModel("Menu1"),
//            MenuModel("Menu2"),
//            MenuModel("Menu3"),
//            MenuModel("Menu4"),
//            MenuModel("Menu1"),
//            MenuModel("Menu2"),
//            MenuModel("Menu3"),
//            MenuModel("Menu4"),
//        )
//
//        val adapter = MenuAdapter(menuList)
//        recyclerView.adapter = adapter


    }
}