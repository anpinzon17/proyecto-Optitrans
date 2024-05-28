// MainActivity.java
package com.example.transmilenioapp

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEditText = findViewById<EditText>(R.id.username)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.login_button)

        loginButton.setOnClickListener { view: View? ->
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Aquí va la lógica de autenticación
            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(
                    this@MainActivity,
                    "Por favor, ingrese todos los campos",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                // Autenticación exitosa (solo un ejemplo)
                Toast.makeText(
                    this@MainActivity,
                    "Inicio de sesión exitoso",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}