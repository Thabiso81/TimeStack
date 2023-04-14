package za.edu.varcitycollege.st10091894.timetracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView


class TimeSheetEntryFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val v = inflater.inflate(R.layout.fragment_time_sheet_entries, container, false)

        val btnNewEntry = v.findViewById<Button>(R.id.btnNewEntry)
        btnNewEntry.setOnClickListener {
            MainActivity().replaceFragment(NewTimeSheetEntryFragment())
        }

        return v
    }



}