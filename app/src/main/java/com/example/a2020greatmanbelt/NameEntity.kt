package com.example.a2020greatmanbelt

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "name")
data class NameEntity(
    var name : String
) {
    @PrimaryKey(autoGenerate = true)
    var id : Int = 0
}