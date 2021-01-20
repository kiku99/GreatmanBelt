package com.example.a2020greatmanbelt.data

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE

@Dao
interface NameDAO {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(name : NameEntity)

    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun readAllData() : LiveData<List<NameEntity>>
}