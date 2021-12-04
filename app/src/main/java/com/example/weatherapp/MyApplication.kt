package com.example.weatherapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

class MyApplication {
    @HiltAndroidApp
    class MyApplication : Application()
}