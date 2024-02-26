package com.example.sos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sos.databinding.ActivitySosBinding

class SosActivity : AppCompatActivity() {
    lateinit var mainSosBinding: ActivitySosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainSosBinding = ActivitySosBinding.inflate(layoutInflater)
        val view = mainSosBinding.root
        setContentView(view)

        mainSosBinding.button3.setOnClickListener {
            val intent = Intent(this@SosActivity,AlterActivity::class.java)
            startActivity(intent)
        }
    }
}