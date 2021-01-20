package com.example.a2020greatmanbelt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.room.Room
import kotlinx.android.synthetic.main.fragment_checklist.*
import kotlinx.android.synthetic.main.fragment_main_gragment.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //nav_graph
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        val db = Room.databaseBuilder(
                applicationContext,
                NameDatabase::class.java, "database-name"
        ).allowMainThreadQueries()
                .build()

        yourname.text = db.nameDAO().getAll().toString()

        StartBtn.setOnClickListener{
            db.nameDAO().insert(NameEntity(edittext_name.text.toString()))
            yourname.text = db.nameDAO().getAll().toString()
        }
    }
}







