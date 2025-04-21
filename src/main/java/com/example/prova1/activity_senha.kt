package com.example.prova1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_senha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_senha)
        val senha1 = findViewById<EditText>(R.id.senha1)
        val senha2 = findViewById<EditText>(R.id.senha2)
        val senha3 = findViewById<EditText>(R.id.senha3)
        val senha4 = findViewById<EditText>(R.id.senha4)
        val realizada = findViewById<Button>(R.id.realizada)

        realizada.setOnClickListener {
            val senhaDigitada = senha1.text.toString() + senha2.text.toString() +
                    senha3.text.toString() + senha4.text.toString()

            val senhaCorreta = "1234"

            if (senhaDigitada == senhaCorreta) {
                val intent = Intent(this, activity_pagamentorealizado::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Senha incorreta!", Toast.LENGTH_SHORT).show()
            }
        }
    }
    }
