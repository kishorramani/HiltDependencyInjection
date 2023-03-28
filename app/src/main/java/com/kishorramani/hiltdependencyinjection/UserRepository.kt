package com.kishorramani.hiltdependencyinjection

import com.kishorramani.hiltdependencyinjection.services.LoggerService
import javax.inject.Inject

private const val TAG = "Ki- UserRepository"

class UserRepository @Inject constructor(private val loggerService: LoggerService) {

    fun saveUser(email: String, password: String) {
        //Log.e(TAG, "saveUser: User saved in DB")
        loggerService.log(TAG, "User saved in DB")
    }
}