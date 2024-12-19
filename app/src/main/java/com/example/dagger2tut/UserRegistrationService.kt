package com.example.dagger2tut

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: EmailService,
) {


    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "Admin", "You are now registered")
    }
}