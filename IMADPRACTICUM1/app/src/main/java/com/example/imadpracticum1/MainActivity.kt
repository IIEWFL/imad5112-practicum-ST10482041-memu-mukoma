package com.example.imadpracticum1

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnadd: Any

    //current fields
    private var userText : EditText? = null
    private var btnnext : Button? = null
    private var btnexit : Button? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// I got this method from
//Module Manual 2025
//Page 29 (finding variables and assigning them to their id)
        //Assigning variables to the id
        val output = findViewById<TextView>(R.id.txtoutput)
        userText = findViewById(R.id.editText)
        btnadd = findViewById<Any>()
        btnnext = findViewById(R.id.btnnext)
        btnexit = findViewById(R.id.btnexit)

        val btnadd =

        (btnadd as View?)?.setOnClickListener {
            val userinput = userText?.text.toString().trim().lowercase()

            if (userinput.isEmpty()) {
                userText?.error = "Please enter song title"
                output.text = ""
            } else {
                val suggestFood = suggestsong(userinput)
                output.text = "$suggestFood"
                userText?.error = null
            }
        }

        btnnext?.setOnClickListener{
            output.text =""
            userText?.text?.next()
        }

    }

    private fun <T> findViewById(): Any {
        TODO("Not yet implemented")
    }

    private fun Song(s: String, s1: String, s2: String): Any {
        TODO("Not yet implemented")
    }

    //i got this method from mr Kincade notes 2025
    private fun suggestsong(userinput: String): String {
        return when (userinput) {
            Song("Shape of You", "Ed Sheeran", "3:53"),
            Song("Blinding Lights", "The Weeknd", "3:20"),
            Song("Levitating", "Dua Lipa", "3:23"),
            Song("Senorita", "Shawn Mendes & Camila Cabello", "3:10")

            }
        }
    }


private fun Editable?.next() {
    TODO("Not yet implemented")
}




