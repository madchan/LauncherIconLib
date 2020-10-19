package com.madchan.library.util

import android.content.Context
import android.content.Intent

/**
 * Activity工具类
 */
class ActivityUtil {

    companion object {

        /**
         * 获取作为启动页的Activity名
         * @param context
         * @return
         */
        fun getLauncherActivityName(context: Context): String? {
            val intent =
                with(Intent(Intent.ACTION_MAIN, null)) {
                    addCategory(Intent.CATEGORY_LAUNCHER)
                    setPackage(context.packageName)
                }
            val resolveInfoList = context.packageManager.queryIntentActivities(intent, 0)
            return if (resolveInfoList != null && resolveInfoList.isNotEmpty()) resolveInfoList[0].activityInfo.name else null
        }
    }

}