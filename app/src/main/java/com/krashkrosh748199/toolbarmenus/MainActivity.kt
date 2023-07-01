package com.krashkrosh748199.toolbarmenus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
when(item.itemId){
    R.id.miAddContact-> Toast.makeText(this,"you clicked on Add Contact",Toast.LENGTH_SHORT).show()
    R.id.miFavorites-> Toast.makeText(this,"you clicked on Favorites",Toast.LENGTH_SHORT).show()
    R.id.miSettings-> Toast.makeText(this,"you clicked on Settings",Toast.LENGTH_SHORT).show()
    R.id.miClose->finish()
    R.id.miFeedback-> Toast.makeText(this,"you clicked on Feedback",Toast.LENGTH_SHORT).show()
}
        return true
    }
}
