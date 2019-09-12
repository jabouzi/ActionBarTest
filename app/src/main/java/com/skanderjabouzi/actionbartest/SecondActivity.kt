package com.skanderjabouzi.actionbartest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        supportActionBar?.setCustomView(R.layout.actionbar_title);
        supportActionBar?.displayOptions =  ActionBar.DISPLAY_SHOW_CUSTOM or ActionBar.DISPLAY_HOME_AS_UP

    }

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, SecondActivity::class.java)
        }
    }
}
