package com.example.quickbite

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Screen07 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen07)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Navigate to Screen08 when clicking imageView21
        val imageView21 = findViewById<ImageView>(R.id.imageView21)
        imageView21.setOnClickListener {
            val intent = Intent(this, Screen08::class.java)
            startActivity(intent)
        }

        // Navigate to Screen08 when clicking imageView14
        val imageView14 = findViewById<ImageView>(R.id.imageView14)
        imageView14.setOnClickListener {
            val intent = Intent(this, Screen08::class.java)
            startActivity(intent)
        }

        // Navigate to Screen09 when clicking imageView22 (Shopping Cart)
        val imageView22 = findViewById<ImageView>(R.id.imageView22)
        imageView22.setOnClickListener {
            val intent = Intent(this, Screen09::class.java)
            startActivity(intent)
        }

        // Navigate to Screen10 when clicking imageView15 (Burger Image)
        val imageView15 = findViewById<ImageView>(R.id.imageView15)
        imageView15.setOnClickListener {
            val intent = Intent(this, Screen10::class.java)
            startActivity(intent)
        }

        // Navigate to Screen11 when clicking imageView16 (Submarine Image)
        val imageView16 = findViewById<ImageView>(R.id.imageView16)
        imageView16.setOnClickListener {
            val intent = Intent(this, Screen11::class.java)
            startActivity(intent)
        }

        // Navigate to Screen02 when clicking imageView23 logOut Icon
        val imageView23 = findViewById<ImageView>(R.id.imageView23)
        imageView23.setOnClickListener {
            val intent = Intent(this, Screen02::class.java)
            startActivity(intent)
        }

        // Navigate to Screen11 when clicking imageView16 (Submarine Image)
        val imageView17 = findViewById<ImageView>(R.id.imageView17)
        imageView17.setOnClickListener {
            val intent = Intent(this, Screen11::class.java)
            startActivity(intent)
        }

        // Navigate to Screen10 when clicking imageView15 (Burger Image)
        val imageView19 = findViewById<ImageView>(R.id.imageView19)
        imageView19.setOnClickListener {
            val intent = Intent(this, Screen10::class.java)
            startActivity(intent)
        }

        val imageView18 = findViewById<ImageView>(R.id.imageView18)
        imageView18.setOnClickListener {
            val intent = Intent(this, Screen11::class.java)
            startActivity(intent)
        }
    }
}
