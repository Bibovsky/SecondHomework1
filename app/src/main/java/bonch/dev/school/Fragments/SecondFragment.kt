package bonch.dev.school.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import bonch.dev.school.R

class SecondFragment:Fragment() {
    //private lateinit var nextActivityButton:Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second,container,false)
        //nextActivityButton=view.findViewById(R.id.next_activity_button)
        return inflater.inflate(R.layout.fragment_second,container,false)
    }
}