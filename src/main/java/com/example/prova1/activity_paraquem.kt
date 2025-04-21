package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_paraquem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_paraquem)
        val botaoTransferindo : ImageButton = findViewById(R.id.botaoTransferindo)
        botaoTransferindo.setOnClickListener {
            val intent = Intent(this, activity_transferindo::class.java)
            startActivity(intent)
        }
    }
}