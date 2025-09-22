package com.bandesha.sencyfitness

import android.app.Application
import android.util.Log
import com.sency.smkitui.SMKitUI
import com.sency.smkitui.listener.SMKitUIConfigurationListener

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Access your BuildConfig fields
        val uiKey = "public_live_Nv3pVZhhAlLIUYZvCv"

        configureSMKitUI(uiKey)
    }

    private fun configureSMKitUI(uiKey: String) {
        val smKitUI: SMKitUI = SMKitUI.Configuration(this)
            .setUIKey(uiKey) // Use the BuildConfig value
            .configure(object : SMKitUIConfigurationListener {
                override fun onSuccess() {
                    Log.d("SMKitUI", "Configuration successful")
                }

                override fun onFailure() {
                    Log.e("SMKitUI", "Configuration failed")

                }
            })
    }
}