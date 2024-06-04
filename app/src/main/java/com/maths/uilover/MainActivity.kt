package com.maths.uilover

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button
    private lateinit var signups: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.login)
        signups = findViewById(R.id.signup)

        btn.setOnClickListener {
            val intent = Intent(this, home_activity::class.java)
            startActivity(intent)
        }
        signups.setOnClickListener {
            val intent = Intent(this, signup_activity::class.java)
            startActivity(intent)
        }
    }
}
