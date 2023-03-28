package com.kishorramani.hiltdependencyinjection.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kishorramani.hiltdependencyinjection.R
import com.kishorramani.hiltdependencyinjection.UserRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        userRepository.saveUser("kishorramani070193@gmail.com", "Kishor@123")

    }
}