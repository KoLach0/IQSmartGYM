package com.example.iqsmartgym

import android.app.Application


class MyApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        FontsOverride.setDefaultFont(this, "MONOSPACE", "kol.ttf")

    }


}