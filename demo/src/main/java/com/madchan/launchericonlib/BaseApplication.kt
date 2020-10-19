package com.madchan.launchericonlib

import android.app.Application
import com.madchan.library.manager.LauncherIconManager

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        LauncherIconManager.register(this)
    }
}