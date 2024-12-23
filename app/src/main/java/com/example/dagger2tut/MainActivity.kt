package com.example.dagger2tut

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val daggerUserRegistrationComponent = DaggerUserRegistrationComponent.builder().build()

        // all the fields marked with @Inject will be null until this piece of code is ran
        daggerUserRegistrationComponent.inject(this)

        userRegistrationService.registerUser("dummy", "123")
    }
}