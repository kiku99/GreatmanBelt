package com.example.a2020greatmanbelt

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface NameDAO {

    @Insert(onConflict = REPLACE)
    fun insert(name : NameEntity)

    @Query("SELECT * FROM name")
    fun getAll() : List<NameEntity>

    @Delete
    fun delete(name : NameEntity)
}