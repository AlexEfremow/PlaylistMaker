package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val backButton = findViewById<Button>(R.id.mainButton)

        backButton.setOnClickListener {
            val buttonIntent = Intent(this, MainActivity::class.java)
            startActivity(buttonIntent)
        }
    }
}