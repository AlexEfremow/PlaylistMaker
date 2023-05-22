package com.example.playlistmaker

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val settings = findViewById<Button>(R.id.button6)
        val search = findViewById<Button>(R.id.button)
        val media = findViewById<Button>(R.id.button4)

        settings.setOnClickListener {
            val settingsIntent = Intent(this, MainActivity2::class.java)
            startActivity(settingsIntent)
        }
        search.setOnClickListener {
            val searchIntent = Intent(this, MainActivity3::class.java)
            startActivity(searchIntent)
        }
        media.setOnClickListener {
            val mediaIntent = Intent(this, MainActivity4::class.java)
            startActivity(mediaIntent)
        }
    }
}