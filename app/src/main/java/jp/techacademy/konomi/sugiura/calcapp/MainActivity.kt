package jp.techacademy.konomi.sugiura.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log

class MainActivity : AppCompatActivity(), View.OnClickListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if((editText1.text.isEmpty())||(editText2.text.isEmpty())) {
            textView.text = "何か数値を入力してください"
        }else{
            val intent = Intent(this, SecondActivity::class.java)
            if (v.id == R.id.button1) {
                intent.putExtra("SUSIKI", "+")
            } else if (v.id == R.id.button2) {
                intent.putExtra("SUSIKI", "-")
            } else if (v.id == R.id.button3) {
                intent.putExtra("SUSIKI", "×")
            } else if (v.id == R.id.button4) {
                intent.putExtra("SUSIKI", "÷")
            }
            intent.putExtra("VALUE1", editText1.text.toString().toDouble())
            intent.putExtra("VALUE2", editText2.text.toString().toDouble())
            startActivity(intent)
        }
    }
}
