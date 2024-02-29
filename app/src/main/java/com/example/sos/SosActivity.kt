package com.example.sos

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.sos.databinding.ActivitySosBinding

class SosActivity : AppCompatActivity() {
    lateinit var mainSosBinding: ActivitySosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainSosBinding = ActivitySosBinding.inflate(layoutInflater)
        val view = mainSosBinding.root
        setContentView(view)

        mainSosBinding.button3.setOnClickListener {
            var alter = AlertDialog.Builder(this)
            alter.setIcon(R.drawable.baseline_warning_amber_24)
            alter.setTitle("Alter Message")
            alter.setMessage("Emergency Alter Message Sent")
            alter.setCancelable(false)
            alter.setNegativeButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                dialogInterface.cancel()
            })
            alter.create().show()
        }
    }
}

