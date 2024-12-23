package com.example.dagger2tut

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

//    @Provides
//    fun getFireBaseRepository(): UserRepository {
//        return FirebaseRepository()
//    }

    @Provides
    fun getSQLRepository(sqlRepository: SQLRepository): UserRepository {
        return sqlRepository
    }


}