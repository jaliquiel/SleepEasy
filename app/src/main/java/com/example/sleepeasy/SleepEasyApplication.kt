package com.example.sleepeasy

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SleepEasyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize any global resources or libraries here
    }
}