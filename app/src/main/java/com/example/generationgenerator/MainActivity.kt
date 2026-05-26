package com.example.generationgenerator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Enum class for generation
    enum class Generation (val title: String) {
        SILENT_GEN ("Silent gen"),
        BOOMERS("Boomers"),
        GEN_X (" Gen X"),
        MILLENNIAL ("Millennial"),
        GEN_Z ("Gen Z"),
        GEN_ALPHA ("Gen Alpha"),
        GEN_BETA ("Gen Beta")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Added variables to UI elements
        val inputNumber = findViewById<EditText>(R.id.InputNumber)
        val submitBtn = findViewById<Button>(R.id.Submitbutton)
        val GeneratorTxt= findViewById<TextView>(R.id.TxtGen)

        // Added code when submit button is clicked
        submitBtn.setOnClickListener {
           //Get year from edit text
            var year = inputNumber.text

            //Determine generation using when expression
            val generation = when (year) {
                
            }



        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}