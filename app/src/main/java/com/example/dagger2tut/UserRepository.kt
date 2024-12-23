package com.example.dagger2tut

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor(): UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("UserRepository", "User saved in SQL")
    }
}

class FirebaseRepository @Inject constructor(): UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("UserRepository", "User saved in Firebase")
    }
}
