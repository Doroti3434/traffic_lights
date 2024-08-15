package com.dorinidelishki.traffic_lights

import android.os.Bundle
import android.graphics.Color
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val redButton: Button = findViewById(R.id.button_red)
        val yellowButton: Button = findViewById(R.id.button_yellow)
        val greenButton: Button = findViewById(R.id.button_green)
        val showScreen: View = findViewById(R.id.show_screen)

        redButton.setOnClickListener{
            textView.text = "Красный"
            showScreen.setBackgroundColor(resources.getColor(R.color.redColor))
        }
        greenButton.setOnClickListener {
            textView.text = "Зеленый"
            showScreen.setBackgroundColor(resources.getColor(R.color.greenColor))
        }
        yellowButton.setOnClickListener {
            textView.text = "Желтый"
            showScreen.setBackgroundColor(resources.getColor(R.color.yellowColor))
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root_layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}