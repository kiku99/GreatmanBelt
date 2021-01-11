package com.example.a2020greatmanbelt

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.net.ContentHandler
import java.security.AccessControlContext

@Database(entities = arrayOf(NameEntity::class), version = 1)
abstract class NameDatabase : RoomDatabase(){
    abstract fun nameDAO() : NameDAO

    companion object {
        var INSTANCE : NameDatabase? = null

        fun getInstance(context: Context) : NameDatabase?{
           if (INSTANCE == null) {
               synchronized(NameDatabase::class) {
                   INSTANCE = Room.databaseBuilder(context.applicationContext,
                  NameDatabase::class.java, "name.db")
                       .fallbackToDestructiveMigration()
                       .build()
               }
           }

            return INSTANCE
        }
    }
}
