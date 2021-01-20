package com.example.a2020greatmanbelt.data

import androidx.lifecycle.LiveData

class UserRepository(private val nameDAO: NameDAO) {

    val readAllData: LiveData<List<NameEntity>> = nameDAO.readAllData()

    suspend fun addUser(name: NameEntity){
        nameDAO.addUser(name)
    }
}