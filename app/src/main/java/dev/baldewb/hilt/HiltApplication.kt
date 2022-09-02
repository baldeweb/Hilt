package dev.baldewb.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HiltApplication: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}