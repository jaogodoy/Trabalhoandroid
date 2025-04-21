package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_revise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_revise)
        val botaosenha : Button = findViewById(R.id.botaosenha)
        botaosenha.setOnClickListener {
            val intent = Intent(this, activity_senha::class.java)
            startActivity(intent)
        }
    }
}