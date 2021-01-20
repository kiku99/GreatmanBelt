package com.example.a2020greatmanbelt

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface NameDAO {

    @Insert(onConflict = REPLACE)
    suspend fun insert(name : NameEntity)

    @Query("SELECT * FROM user_name")
    fun getAll() : LiveData<List<NameEntity>>

    @Delete
    fun delete(name : NameEntity)
}