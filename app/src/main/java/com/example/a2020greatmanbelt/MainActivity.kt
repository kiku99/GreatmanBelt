package com.example.a2020greatmanbelt

import android.annotation.SuppressLint
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.fragment_main_gragment.*

class MainActivity : AppCompatActivity() {


   lateinit var db : NameDatabase
    var nameList = listOf<NameEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //nav_graph
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        //db
        db = NameDatabase.getInstance(this)!!

        StartBtn.setOnClickListener{

            var name = NameEntity(null, edittext_name.text.toString())
            insertName(name)
        }

    }
    @SuppressLint("StaticFieLeak")
    fun insertName(name : NameEntity){

        val insertTask = object : AsyncTask<Unit,Unit,Unit>(){
            override fun doInBackground(vararg params: Unit?) {
                db.nameDAO().insert(name)
            }

            override fun onPostExecute(result: Unit?) {
                super.onPostExecute(result)
                getName()
            }
        }
        insertTask.execute()
    }

    fun getName(){
        val getTask = (object : AsyncTask<Unit,Unit,Unit>() {

            override fun doInBackground(vararg params: Unit?){
                nameList = db.nameDAO().getAll()
            }
        }).execute()

    }
}
