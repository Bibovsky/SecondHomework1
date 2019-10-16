package bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ss:String = intent.getStringExtra("intentText")
        setContentView(R.layout.activity_second)
        textView=findViewById(R.id.textView)
        textView.text=ss

    }

}
