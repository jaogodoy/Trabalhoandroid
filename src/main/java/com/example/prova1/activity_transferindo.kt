package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_transferindo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transferindo)
        val botaocomotransferir : Button = findViewById(R.id.botaocomotransferir)
        botaocomotransferir.setOnClickListener {
            val intent = Intent(this, activity_comogostariatransferir::class.java)
            startActivity(intent)
        }
    }
}