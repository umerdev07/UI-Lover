package com.maths.uilover

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class signup_activity : AppCompatActivity() {
    private lateinit var login_id: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        login_id = findViewById(R.id.login)

        login_id.setOnClickListener {
            Toast.makeText(this , "Login Successfully" , Toast.LENGTH_SHORT).show()
        }

    }
}