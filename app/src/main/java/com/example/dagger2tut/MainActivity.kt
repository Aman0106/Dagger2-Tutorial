package com.example.dagger2tut

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daggerComponent = DaggerUserRegistrationComponent.builder().build()

        val userRegistrationService = daggerComponent.getUserRegistrationService()
        val emailService = daggerComponent.getEmailService()
        userRegistrationService.registerUser("dummy", "123")
    }
}