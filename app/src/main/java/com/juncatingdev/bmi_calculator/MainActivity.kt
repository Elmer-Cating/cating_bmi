package com.juncatingdev.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnChangeText = findViewById<Button>(R.id.calculateButton)
        val result = findViewById<TextView>(R.id.infoTxt)
        val weight = findViewById<TextView>(R.id.weight).text
        val height = findViewById<TextView>(R.id.height).text

        btnChangeText.setOnClickListener {
            val bmiWeight = weight.toString().toDouble()
            val bmiHeight = height.toString().toDouble()
            val bmiCalc =  (bmiWeight)/  (bmiHeight*bmiHeight)
            result.text = String.format("%.2f", bmiCalc);
        }



    }
            }




