package org.zhuxiaole.iptv.init

import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import androidx.startup.Initializer

class AppInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()
}