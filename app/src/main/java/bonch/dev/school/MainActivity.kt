package bonch.dev.school

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var indButton: Button
    private lateinit var countButton: Button
    private lateinit var nextActivityButton: Button
    private lateinit var textField: EditText

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
        nextActivityButton=findViewById(R.id.next_activity_button)
        textField = findViewById(R.id.text_field)
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

        nextActivityButton.setOnClickListener(){
            val intent = Intent(this,SecondActivity::class.java)
            var s:String = textField.text.toString()
            intent.putExtra("intentText",s)
            startActivity(intent)

        }

    }
}
