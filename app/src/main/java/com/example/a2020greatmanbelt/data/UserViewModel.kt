package com.example.a2020greatmanbelt.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(application: Application): AndroidViewModel(application) {

    private val readAllData: LiveData<List<NameEntity>>
    private val repository: UserRepository

    init {
        val nameDao = NameDatabase.getDatabase(application).nameDAO()
        repository = UserRepository(nameDao)
        readAllData = repository.readAllData
    }

    fun addUser(name: NameEntity){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addUser(name)
        }
    }
}