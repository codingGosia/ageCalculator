package com.gosia.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        mCalBtn.setOnClickListener { 


            val userDB = yearEditText.text.toString().trim()

            val year:Int = Calendar.getInstance().get(Calendar.YEAR)

            if (userDB == "") {
                Toast. makeText(this, "Please Enter a year", Toast.LENGTH_LONG).show()
            }
            else if (userDB > year.toString()) {
                Toast.makeText(this, "Year should be less then", Toast.LENGTH_LONG).show()
            }
            else {
                val myAge = year - userDB.toInt()
                ageTextView.text = "Your age is " +myAge+" years"
            }
        }
    }
}