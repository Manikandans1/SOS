package com.sosapp.sos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sosapp.sos.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var mainLoginBinding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
        val view = mainLoginBinding.root
        setContentView(view)

        mainLoginBinding.Submit.setOnClickListener {
            val intent = Intent(this@LoginActivity,SosActivity::class.java)
            startActivity(intent)
        }
    }
}