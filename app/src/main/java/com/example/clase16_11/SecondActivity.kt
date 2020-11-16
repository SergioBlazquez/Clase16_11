package com.example.clase16_11

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {


    companion object {
        const val FOTO = "prim"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val iv1 = findViewById<ImageView>(R.id.iv1)


        if(FOTO!="prim") {
            //iv1.srcCompat=@tools:sample/backgrounds/scenic
        }

        val bv1 = findViewById<TextView>(R.id.bv1)

        bv1.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }
}