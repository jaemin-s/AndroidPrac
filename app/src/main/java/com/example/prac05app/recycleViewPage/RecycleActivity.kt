package com.example.prac05app.recycleViewPage

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.prac05app.R
import com.example.prac05app.model.UserInfo

class RecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)

        val recyclerView: RecyclerView = findViewById(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        val userList = arrayListOf<UserInfo>()
        for(i in 19..60){
            userList.add(UserInfo("Kim",i))
        }

        val adapter = RvAdapter(userList)
        recyclerView.adapter = adapter





























//        var recyclerView: RecyclerView = findViewById(R.id.rv)
//        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//
//        val userList = arrayListOf(
//            UserInfo("Kim",19),
//            UserInfo("Lee",24),
//            UserInfo("Sim",29),
//            UserInfo("Seo",23),
//            UserInfo("Kim",19),
//            UserInfo("Lee",29),
//            UserInfo("Lee",34),
//            UserInfo("Kim",14),
//            UserInfo("Kim",22),
//            UserInfo("Kim",21),
//            UserInfo("Lee",24),
//            UserInfo("Kim",19),
//            UserInfo("Lee",24),
//            UserInfo("Sim",29),
//            UserInfo("Seo",23),
//            UserInfo("Kim",19),
//            UserInfo("Lee",29),
//            UserInfo("Lee",34),
//            UserInfo("Kim",14),
//            UserInfo("Kim",22),
//            UserInfo("Kim",21),
//            UserInfo("Lee",24),
//        )
//
//        val adapter = RvAdapter(userList)
//
//        recyclerView.adapter = adapter

    }
}