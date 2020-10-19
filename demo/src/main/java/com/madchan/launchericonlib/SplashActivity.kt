package com.madchan.launchericonlib

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import java.util.*

class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Timer().schedule(object : TimerTask() {
            override fun run() {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            }
        }, 2000)
    }

}