package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_transferencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_transferencia)

        val botaoparaquem : ImageButton = findViewById(R.id.botaoparaquem)
        botaoparaquem.setOnClickListener {
            val intent = Intent(this, activity_paraquem::class.java)
            startActivity(intent)
        }
    }
}