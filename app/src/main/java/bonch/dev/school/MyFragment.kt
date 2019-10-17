package bonch.dev.school

import android.content.Intent
import android.content.Intent.getIntent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.*

class MyFragment(act: FragmentActivityTask3) : Fragment() {
    private lateinit var textView:TextView
    private var a:FragmentActivityTask3=act
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_my_fragment,container,false)
        textView=view.findViewById(R.id.text_viewfg)
        //textView.setText((activity as FragmentActivityTask3).getData())
        var s = a.getData()
        textView.text=s
        return view
    }

}
