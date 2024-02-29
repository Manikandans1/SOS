package com.sosapp.sos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sosapp.sos.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var mainSignupBinding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainSignupBinding = ActivitySignupBinding.inflate(layoutInflater)
        val view = mainSignupBinding.root
        setContentView(view)

        mainSignupBinding.button.setOnClickListener {
            val intent = Intent(this@SignupActivity,SosActivity::class.java)
            startActivity(intent)
        }
    }
}