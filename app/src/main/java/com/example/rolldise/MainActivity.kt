package com.example.rolldise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.lang.Math.random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val etresult: TextView = findViewById(R.id.et_result)
        val btnroll: Button = findViewById(R.id.btn_Diseroll)
        val ivdice: ImageView = findViewById(R.id.iv_Dice)


        btnroll.setOnClickListener {

            val randomNum: Int = (1..6).random()
            etresult.text = randomNum.toString()
            if(randomNum == 1) {
                ivdice.setImageResource(R.drawable.dice1)
            } else if (randomNum == 2) {
                ivdice.setImageResource(R.drawable.dice2)
            } else if (randomNum == 3) {
                ivdice.setImageResource(R.drawable.dice3)
            } else if (randomNum == 4) {
                ivdice.setImageResource(R.drawable.dice4)
            } else if (randomNum == 5) {
                ivdice.setImageResource(R.drawable.dice5)
            } else {
                ivdice.setImageResource(R.drawable.dice6)
            }

        }
    }
}