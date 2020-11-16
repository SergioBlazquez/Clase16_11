package com.example.clase16_11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var aux = "si"


        val b1 = findViewById<TextView>(R.id.b1)
        val b2 = findViewById<TextView>(R.id.b2)
        val b3 = findViewById<TextView>(R.id.b3)

        val et1= findViewById<TextView>(R.id.et1)


        b1.setOnClickListener(){



            val intent = Intent(this, SecondActivity::class.java)


            startActivity(intent)
        }

        b2.setOnClickListener(){



            val intent = Intent(this, ThirdActivity::class.java)

            val parametro=et1.length()
            val parametro2=et1.text


            intent.putExtra(ThirdActivity.TAM,parametro)
            intent.putExtra(ThirdActivity.CODE,parametro2)

            startActivity(intent)
        }

        b3.setOnClickListener(){

            val parametro3="CAMBIAR"
            val foto="segunda"


            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra(ThirdActivity.CONTENT,parametro3)

            intent.putExtra(SecondActivity.FOTO, foto)

            startActivity(intent)

        }


    }
}