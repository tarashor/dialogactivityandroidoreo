package com.tarashor.dialogactivityandroidoreo

import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class DialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)
        if (resources.getBoolean(R.bool.is_phone)) {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        }
    }

    companion object {
        fun newIntent(context: Context) : Intent{
            return Intent(context, DialogActivity::class.java)
        }
    }
}
