package com.example.quickbite

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Screen10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen10)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to Screen07 when clicking the back arrow
        val backArrow = findViewById<ImageView>(R.id.back_Arrow)
        backArrow.setOnClickListener {
            val intent = Intent(this, Screen07::class.java)
            startActivity(intent)
            finish() // Close current activity
        }

        // Navigate to Screen09 when clicking "Order Now" button
        val addOrderButton = findViewById<Button>(R.id.AddOrder)
        addOrderButton.setOnClickListener {
            val intent = Intent(this, Screen09::class.java)
            startActivity(intent)
        }
    }
}
