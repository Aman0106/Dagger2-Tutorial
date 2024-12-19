package com.example.dagger2tut

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){
    fun saveUser(email: String, password: String) {
        Log.d("UserRepository", "User saved in DB")
    }
}