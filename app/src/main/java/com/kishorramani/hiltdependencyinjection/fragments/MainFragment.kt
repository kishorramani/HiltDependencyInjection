package com.kishorramani.hiltdependencyinjection.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kishorramani.hiltdependencyinjection.R
import com.kishorramani.hiltdependencyinjection.UserRepository
import com.kishorramani.hiltdependencyinjection.qualifier.FirebaseQualifier
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainFragment : Fragment() {

    @Inject
    @FirebaseQualifier
    lateinit var userRepository: UserRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        userRepository.saveUser("kishorramani070193@gmail.com", "Kishor@123")

        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}