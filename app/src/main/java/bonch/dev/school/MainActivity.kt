package bonch.dev.school

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var indButton: Button
    private lateinit var countButton: Button
    var a=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        setListeners()
    }
    private fun initializeViews(){
        indButton = findViewById(R.id.indicator_button)
        countButton = findViewById(R.id.counter_button)


    }
    private fun setListeners(){
        var a=0
        indButton.setOnClickListener{
            indButton.isClickable=false
        }
        countButton.setOnClickListener{
            a++
            countButton.text=a.toString()
        }

        /*nextActButton.setOnClickListener(){
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }*/

    }
}
