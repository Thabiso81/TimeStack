package za.edu.varcitycollege.st10091894.timetracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private val timeSheetEntryFragment = TimeSheetEntryFragment()
private val timeSheetCategoryFragment = TimeSheetCategoryFragment()
private val timeSheetStatsFragment = TimeSheetStatsFragment()
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavMenu)

        //default fragment that shows up first when app is first openned
        replaceFragment(timeSheetEntryFragment)

        //set bottom navigation view functionality
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.miEntries -> replaceFragment(timeSheetEntryFragment)
                R.id.miCreateCategory -> replaceFragment(timeSheetCategoryFragment)
                R.id.miGraph -> replaceFragment(timeSheetStatsFragment)
            }
            true
        }

    }

    //Method that switches out fragments on the main activity
    fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, fragment)
            transaction.commit()
        }
    }
}