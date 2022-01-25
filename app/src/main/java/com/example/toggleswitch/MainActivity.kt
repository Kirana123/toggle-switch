package com.example.toggleswitch

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Switch
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstLayout: LinearLayout = findViewById(R.id.firstLayout)
        val toggle: ToggleButton = findViewById(R.id.toggle)
        val switch: Switch = findViewById(R.id.swich)
        val image: ImageView = findViewById(R.id.imageView1)
        toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                image.setImageResource(R.drawable.go)
            } else {
                image.setImageResource(R.drawable.stop)
            }
        }
        switch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                firstLayout.setBackgroundColor(Color.BLUE)
            } else {
                firstLayout.setBackgroundColor(Color.WHITE)
            }
        }
    }
}