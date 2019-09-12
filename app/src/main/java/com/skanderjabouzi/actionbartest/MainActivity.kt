package com.skanderjabouzi.actionbartest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar // or getActionBar();
        supportActionBar!!.setTitle("My new title") // set the top title
        val title = actionBar!!.title.toString() // get the title
//        actionBar.hide()
        actionBar.setDisplayShowHomeEnabled(true)
        actionBar.setLogo(R.mipmap.ic_launcher)
        actionBar.setDisplayUseLogoEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle presses on the action bar items
        when (item.itemId) {
            R.id.miProfile -> {
                Toast.makeText(
                    this,
                    "You clicked at item ${item} from onOptionsItemSelected -> when",
                    Toast.LENGTH_SHORT
                ).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    fun onComposeAction(mi: MenuItem) {
        Toast.makeText(
            this,
            "You clicked at item ${mi} from onComposeAction",
            Toast.LENGTH_SHORT
        ).show()
    }

    fun showSecondActivity(view: View) {
        startActivity(SecondActivity.getIntent(this))
    }
}
