package com.example.biggernumbergame

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //instance variable
    lateinit var buttonLeft: Button
    lateinit var buttonRight: Button
    lateinit var counter: TextView

    var points = 0
    var numLeft = (Math.random() * 100).toInt()
    var numRight = (Math.random() * 100).toInt()

   fun name(){
       while(numLeft==numRight){
           numLeft = (Math.random() *100).toInt()
       }
   }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //wire widget
        buttonLeft = findViewById(R.id.button_main_left)
        buttonRight = findViewById(R.id.button_main_right)
        counter = findViewById(R.id.textview_main_score)
        counter.text = "Points: 0"
        name()
        buttonLeft.text = numLeft.toString()
        buttonRight.text = numRight.toString()
        //button clicked
            buttonLeft.setOnClickListener {

                if (numLeft != numRight&&numLeft > numRight) {
                    points++
                } else if (numLeft != numRight&&numLeft < numRight) {
                    points--
                }
                counter.text = "Points: $points"
                numLeft = (Math.random() * 100).toInt()
                numRight = (Math.random() * 100).toInt()
                name()
                buttonLeft.text = numLeft.toString()
                buttonRight.text = numRight.toString()
                if (points % 10 == 0) {
                    Toast.makeText(this, "$points Hooray!", Toast.LENGTH_SHORT).show()
                }
               
            }
            buttonRight.setOnClickListener {
                if (numLeft != numRight&&numLeft > numRight) {
                    points--
                } else if (numLeft != numRight&&numLeft < numRight) {
                    points++
                }
                counter.text = "Points: $points"
                numLeft = (Math.random() * 100).toInt()
                numRight = (Math.random() * 100).toInt()
                name()
                buttonLeft.text = numLeft.toString()
                buttonRight.text = numRight.toString()
                if (points % 10 == 0) {
                    Toast.makeText(this, "$points Hooray!", Toast.LENGTH_SHORT).show()
                }

            }
    }

}