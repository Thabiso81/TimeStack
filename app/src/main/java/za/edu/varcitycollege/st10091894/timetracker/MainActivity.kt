package za.edu.varcitycollege.st10091894.timetracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navBar = findViewById<BottomNavigationView>(R.id.bottomNavMenu)
        //remove shadow from bottom nav bar when program runs
        //navBar.background = null

    }
}