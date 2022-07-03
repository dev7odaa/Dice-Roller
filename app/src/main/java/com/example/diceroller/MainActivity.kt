package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var rollButton: Button
    private lateinit var imgRoll: ImageView
    private var number = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgRoll = findViewById(R.id.imgRoll)
        rollButton = findViewById(R.id.btn_roll)

        rollButton.setOnClickListener {
            number += 1
            rollButton.text = "Rolled $number"
            rollDice()
        }
    }

    private fun rollDice() {
        var randomInt = Random().nextInt(6) + 1
        val drawableRecourse = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        imgRoll.setImageResource(drawableRecourse)
    }
}
