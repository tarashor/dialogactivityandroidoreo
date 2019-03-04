package com.tarashor.dialogactivityandroidoreo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.show_dialog_btn).setOnClickListener {
            val intent = DialogActivity.newIntent(this);
            startActivity(intent);
        }
    }
}
