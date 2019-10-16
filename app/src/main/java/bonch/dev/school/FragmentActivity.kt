package bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import bonch.dev.school.Fragments.FirstFragment
import bonch.dev.school.Fragments.SecondFragment
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity() {
    val fm = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val firstFragment=FirstFragment()
        fm.beginTransaction().add(R.id.fragment1,firstFragment).commit()

        //val secondFragment=SecondFragment()
        //fm.beginTransaction().add(R.id.fragment2,secondFragment).commit()


    }
    fun replaceFragment(){
        val secondFragment=SecondFragment()
        fm.beginTransaction().replace(R.id.fragment1,secondFragment).addToBackStack("second_frgm").commit()
    }
}
