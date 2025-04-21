package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_comogostariatransferir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_comogostariatransferir)
        val continuarcomsaldo : Button = findViewById(R.id.continuarcomsaldo)
        continuarcomsaldo.setOnClickListener {
            val intent = Intent(this, activity_revise::class.java)
            startActivity(intent)
        }
    }
}