package com.example.dagger2tut

import android.util.Log
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from:String, body: String)
}

class EmailService @Inject constructor(): NotificationService{

    override fun send(to: String, from:String, body: String) {
        Log.d("EmailService", "to:$to, from:$from, body:$body");
    }
}

class MessageService : NotificationService{

    override fun send(to: String, from:String, body: String) {
        Log.d("MessageService", "to:$to, from:$from, body:$body");
    }

}