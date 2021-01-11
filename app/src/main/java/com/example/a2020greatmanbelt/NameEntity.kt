package com.example.a2020greatmanbelt

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "name")
data class NameEntity(
    @PrimaryKey(autoGenerate = true)
    var id : Long?,
    var name : String = "")