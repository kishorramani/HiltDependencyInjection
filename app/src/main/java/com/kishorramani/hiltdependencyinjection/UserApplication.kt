package com.kishorramani.hiltdependencyinjection

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication: Application() {

//    @Inject
//    lateinit var userRepository: UserRepository

    override fun onCreate() {
        super.onCreate()

//        userRepository.saveUser("kishorramani070193@gmail.com", "Kishor@123")
    }
}