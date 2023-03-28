package com.kishorramani.hiltdependencyinjection.services

import android.util.Log
import javax.inject.Inject

private const val TAG = "Ki- LoggerService"

class LoggerService @Inject constructor() {
    fun log(tag: String, message: String) {
        Log.e(tag, "Message: $message")
    }
}