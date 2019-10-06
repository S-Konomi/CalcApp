package jp.techacademy.konomi.sugiura.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getDoubleExtra("VALUE1",0.0)
        val value2 = intent.getDoubleExtra("VALUE2",0.0)
        val susiki = intent.getStringExtra("SUSIKI")
        if(susiki == "+"){
            textView.text = "${value1 + value2}"
        }else if(susiki == "-"){
            textView.text = "${value1 - value2}"
        }else if(susiki == "×"){
            textView.text = "${value1 * value2}"
        }else if(susiki == "÷"){
            textView.text = "${value1 / value2}"
        }

    }
}
