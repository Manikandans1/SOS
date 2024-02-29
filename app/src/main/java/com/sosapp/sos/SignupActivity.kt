
package com.sosapp.sos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.sosapp.sos.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignupBinding
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.save.setOnClickListener {

            val name = binding.txt1.text.toString()
            val mobilenumber = binding.txt2.text.toString()
            val aadharnumber = binding.txt3.text.toString()
            val fathername = binding.txt4.text.toString()
            val fathernumber = binding.txt5.text.toString()
            val mothername = binding.txt6.text.toString()
            val homeaddress = binding.txt7.text.toString()


            if (name.isNotEmpty() && mobilenumber.isNotEmpty()&& aadharnumber.isNotEmpty()&&fathername.isNotEmpty() && fathernumber.isNotEmpty()&& mothername.isNotEmpty()&& homeaddress.isNotEmpty()) {

                database = FirebaseDatabase.getInstance().getReference("Users")
                val User = user(name,mobilenumber,aadharnumber,fathername,fathernumber,mothername,homeaddress)

                database.child(name).setValue(User).addOnSuccessListener {

                    binding.txt1.text?.clear()
                    binding.txt2.text?.clear()
                    binding.txt3.text?.clear()
                    binding.txt4.text?.clear()
                    binding.txt5.text?.clear()
                    binding.txt6.text?.clear()
                    binding.txt7.text?.clear()


                    Toast.makeText(this, "Successfully Saved", Toast.LENGTH_SHORT).show()
                    if(1==1){


                    }


                }.addOnFailureListener {

                    Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()


                }
            } else {
                Toast.makeText(this, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT).show()

            }

        }

    }

    data class user(
        val name: String? = null,
        val mobilnumber: String? = null,
        val userName: String? = null,
        val fathername: String? =null,
        val fathernumber: String? =null,
        val mothername: String? =null,
        val homeaddress: String? =null
    ){

    }
}