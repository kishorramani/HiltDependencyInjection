package com.kishorramani.hiltdependencyinjection.modules

import com.kishorramani.hiltdependencyinjection.FirebaseRepository
import com.kishorramani.hiltdependencyinjection.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent

//@InstallIn(FragmentComponent::class)
//@InstallIn(SingletonComponent::class)
@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    @Provides
    fun provideUserRepository() : UserRepository {
        return FirebaseRepository()
    }

}