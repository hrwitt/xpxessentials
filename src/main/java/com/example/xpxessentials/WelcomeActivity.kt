package com.example.xpxessentials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class WelcomeActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Welcome page objects
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnContinue = findViewById<Button>(R.id.btnContinue)
        val btnLogo = findViewById<ImageButton>(R.id.btnLogo)

        btnLogin.setOnClickListener(loginSelected)
        btnLogo.setOnClickListener(logoSelect)
    }

    private val loginSelected = View.OnClickListener {
        Toast.makeText(this@WelcomeActivity,"Got clicked",Toast.LENGTH_LONG).show()
    }

    private val logoSelect = View.OnClickListener {
        Toast.makeText(this@WelcomeActivity,"This will redirect to the website",Toast.LENGTH_LONG).show()
    }

}
