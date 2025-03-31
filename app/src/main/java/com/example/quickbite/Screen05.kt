package com.example.quickbite

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView
import android.widget.Button

class Screen05 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen05)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to Screen04 when clicking the back arrow
        val backButton = findViewById<ImageView>(R.id.imageView35)
        backButton.setOnClickListener {
            val intent = Intent(this, Screen04::class.java)
            startActivity(intent)
        }

        // Navigate to Screen06 when clicking "Create Account" button
        val createAccountButton = findViewById<Button>(R.id.button4)
        createAccountButton.setOnClickListener {
            val intent = Intent(this, Screen06::class.java)
            startActivity(intent)
        }
    }
}
