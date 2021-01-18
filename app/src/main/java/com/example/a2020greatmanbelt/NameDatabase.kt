package com.example.a2020greatmanbelt

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.net.ContentHandler
import java.security.AccessControlContext

@Database(entities = [NameEntity::class], version = 1)
abstract class NameDatabase : RoomDatabase(){
    abstract fun nameDAO() : NameDAO
}
