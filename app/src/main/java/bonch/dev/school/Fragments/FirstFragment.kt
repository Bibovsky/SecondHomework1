package bonch.dev.school.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import bonch.dev.school.FragmentActivity
import bonch.dev.school.R
import kotlinx.android.synthetic.main.activity_fragment.*

class FirstFragment:Fragment() {
    private lateinit var nextActivityButton: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first,container,false)
        nextActivityButton=view.findViewById(R.id.next_activity_button)
        nextActivityButton.setOnClickListener {
            (context as FragmentActivity).replaceFragment()
        }
        return view //inflater.inflate(R.layout.fragment_first,container,false)
    }
}