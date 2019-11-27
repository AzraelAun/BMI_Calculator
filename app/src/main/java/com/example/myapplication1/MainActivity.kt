package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo:: function to calculate and return BMI
        fun calculateBMI(height:Double, weight:Double):Double{

            return weight / (height*height)
        }

        button.setOnClickListener() {

            //todo:: onclick listener for button calculate
            //todo:: calculate BMI by invoke the function
            //todo:: display image and result

            val weight: Double = editText.text.toString().toDouble()
            val height: Double = editText2.text.toString().toDouble()
            val BMI = calculateBMI( height , weight )

            if (BMI < 18.5) {
                imageView.setImageResource(R.drawable.under)
                textView4.text = "BMI: " + "%.2f".format(BMI) + " Underweight"
            } else if (BMI >= 18.5 && BMI <= 24.9) {
                imageView.setImageResource(R.drawable.normal)
                textView4.text = "BMI: " + "%.2f".format(BMI) + " Normal"
            } else if (BMI > 25) {
                imageView.setImageResource(R.drawable.over)
                textView4.text = "BMI: " + "%.2f".format(BMI) + " Overweight"
            }
        }

        button2.setOnClickListener() {

            //todo:: onclick listener for reset
            //todo:: clear inputs & result
            //todo:: clear image

            editText.text.clear()
            editText2.text.clear()
            textView4.text = " "
            imageView.setImageResource(R.drawable.empty)
        }
    }
}
