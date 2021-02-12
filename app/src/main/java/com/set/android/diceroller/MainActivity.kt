package com.set.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }
    private fun rollDice() {
        val randomInt_1 = (1..6).random()
        val randomInt_2 = (1..6).random()
        Toast.makeText(this, "Zar Atıldı",Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Atılan Zarlar: " + randomInt_1.toString() + " ve "  + randomInt_2.toString()
    }
}