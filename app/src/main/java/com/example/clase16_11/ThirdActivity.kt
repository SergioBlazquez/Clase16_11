package com.example.clase16_11

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    companion object {
        const val TAM = "hey"
        const val CODE = "yeh"
        const val CONTENT ="no"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val variable = intent.getStringExtra(TAM)
        val variable2 = intent.getStringExtra(CODE)
        val variable3 = intent.getStringExtra(CONTENT)
        val et2= findViewById<TextView>(R.id.et2)

        if(variable3=="no")
        et2.text== "El edit text de la activity anterior tenía una longitud de $variable caracteres"
        else{

            if (variable2 != null) {
                et2.text== "El edit text de la activity anterior contenía ${variable2.toUpperCase()} "
            }



        }


        val bv2 = findViewById<TextView>(R.id.bv2)

        bv2.setOnClickListener(){

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


    }



}