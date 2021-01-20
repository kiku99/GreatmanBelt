package com.example.a2020greatmanbelt

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.net.ContentHandler
import java.security.AccessControlContext

@Database(entities = [NameEntity::class], version = 1, exportSchema = false)
abstract class NameDatabase : RoomDatabase(){
    abstract fun nameDAO() : NameDAO

    companion object{
        @Volatile
        private var INSTANCE: NameDatabase? = null

        fun getDatabase(context: Context): NameDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NameDatabase::class.java,
                    "name_database"
                ).build()
                INSTANCE = instance
                return  instance
            }
        }
    }
}
