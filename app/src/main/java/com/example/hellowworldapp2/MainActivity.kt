package com.example.hellowworldapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var num1 :EditText
    lateinit var num2 :EditText
    lateinit var txt4 :TextView
    lateinit var plus :Button
    lateinit var minus :Button
    lateinit var multiplay :Button
    lateinit var divide :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         num1 = findViewById(R.id.num1)
         num2 = findViewById(R.id.num2)
         txt4 = findViewById(R.id.Result)
         plus = findViewById(R.id.plus)
         minus = findViewById(R.id.minus)
         multiplay = findViewById(R.id.multiply)
         divide = findViewById(R.id.divide)


        plus.setOnClickListener {
            val res = "${num1.text}".toDouble() + "${num2.text}".toDouble()
            txt4.text = "$res"
        }

        minus.setOnClickListener {
            val res = "${num1.text}".toDouble() - "${num2.text}".toDouble()
            txt4.text = "$res"
        }

        multiplay.setOnClickListener {
            val res = "${num1.text}".toDouble() * "${num2.text}".toDouble()
            txt4.text = "$res"
        }

        divide.setOnClickListener {
            val res = "${num1.text}".toDouble() / "${num2.text}".toDouble()
            txt4.text = "$res"
        }



        }




        }


//try {
//    var result0 = when (operation) {
//        "+" -> num1 + num2
//        "-" -> num1 - num2
//        "*" -> num1 * num2
//        "/" -> num1 / num2
//        else -> throw Exception("Invalid operator")
//    }
//    txt4.text = "88"
//}catch(e: Exception){
//    print("try error")
//    txt4.text = "9999"
//}