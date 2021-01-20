package com.example.a2020greatmanbelt.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_name")
data class NameEntity(
    @PrimaryKey(autoGenerate = true)
    var name : String,
    var id : Int
)