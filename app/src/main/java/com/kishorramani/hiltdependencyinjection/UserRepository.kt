package com.kishorramani.hiltdependencyinjection

import android.util.Log
import javax.inject.Inject

private const val TAG = "Ki- UserRepository"

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e(TAG, "saveUser: User saved in SQL DB")
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e(TAG, "saveUser: User saved in Firebase DB")
    }
}