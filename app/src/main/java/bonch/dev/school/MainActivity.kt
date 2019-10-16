package bonch.dev.school

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var indButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        setListeners()
    }
    private fun initializeViews(){
        indButton = findViewById(R.id.indicator_button)


    }
    private fun setListeners(){
        indButton.setOnClickListener{
            indButton.isClickable=false
        }
        /*nextActButton.setOnClickListener(){
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }*/

    }
}
