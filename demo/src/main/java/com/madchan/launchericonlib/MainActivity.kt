package com.madchan.launchericonlib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.madchan.library.bean.SwitchIconTask
import com.madchan.library.manager.LauncherIconManager
import java.text.SimpleDateFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val format = SimpleDateFormat("yyyy-MM-dd")

        LauncherIconManager.addNewTask(
            SwitchIconTask(
                SplashActivity::class.java.name,
                "$packageName.SplashAliasActivity",
                format.parse("2020-10-27").time,
                format.parse("2020-11-02").time
            ),
            SwitchIconTask(
                SplashActivity::class.java.name,
                "$packageName.SplashAlias2Activity",
                format.parse("2020-11-11").time,
                format.parse("2020-11-12").time
            )
        )
    }
}