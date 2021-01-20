package com.example.a2020greatmanbelt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.room.Room
import com.example.a2020greatmanbelt.data.NameDatabase
import com.example.a2020greatmanbelt.data.NameEntity
import kotlinx.android.synthetic.main.fragment_checklist.*
import kotlinx.android.synthetic.main.fragment_main_gragment.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //nav_graph
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

    }
}







