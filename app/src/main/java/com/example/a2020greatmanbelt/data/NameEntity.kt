package com.example.a2020greatmanbelt.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class NameEntity(
    @PrimaryKey(autoGenerate = true)
    var id : Int,
    var name : String
)