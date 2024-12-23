package com.example.dagger2tut

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class UserRepositoryModule {

//    @Provides
//    fun getFireBaseRepository(): UserRepository {
//        return FirebaseRepository()
//    }

    @Binds
    abstract fun getSQLRepository(sqlRepository: FirebaseRepository): UserRepository

}