package com.example.dagger2tut

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService
    fun getEmailService(): EmailService
}