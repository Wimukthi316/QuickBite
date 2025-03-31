package com.example.quickbite

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Screen06 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen06)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to Screen07 when clicking the Login button
        val loginButton = findViewById<Button>(R.id.button5)
        loginButton.setOnClickListener {
            val intent = Intent(this, Screen07::class.java)
            startActivity(intent)
        }

        // Navigate to Screen07 when clicking the Google Image
        val googleImage = findViewById<ImageView>(R.id.imageView8)
        googleImage.setOnClickListener {
            val intent = Intent(this, Screen07::class.java)
            startActivity(intent)
        }

        // Navigate back to Screen05 when clicking the Back Arrow
        val backArrow = findViewById<ImageView>(R.id.imageView40)
        backArrow.setOnClickListener {
            val intent = Intent(this, Screen05::class.java)
            startActivity(intent)
        }
    }
}
