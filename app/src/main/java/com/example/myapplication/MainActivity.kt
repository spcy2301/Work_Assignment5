package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toast_bt1=Toast.makeText(applicationContext,"ไม่สามารถเพิ่มค่าได้!",Toast.LENGTH_LONG)
        val toast_bt2=Toast.makeText(applicationContext,"ไม่สามารถลดค่าได้!",Toast.LENGTH_LONG)
        val toast_bt3=Toast.makeText(applicationContext,"รีเซ็ตค่าแล้ว!",Toast.LENGTH_LONG)
        var a = 0

        bt1.setOnClickListener(){
            if(a<= 8 && a >=0){
                a++
                var text = findViewById<TextView>(R.id.text)
                text.setText("$a")
            }else{
                toast_bt1.show()
            }
        }
        bt2.setOnClickListener(){
            if(a>0){
                a=a-1
                var text = findViewById<TextView>(R.id.text)
                text.setText("$a")
            }else{
                toast_bt2.show()
            }
        }
        bt3.setOnClickListener(){
            a = 0
            var text = findViewById<TextView>(R.id.text)
            text.setText("$a")
            toast_bt3.show()
        }
    }
}