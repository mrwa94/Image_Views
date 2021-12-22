package com.example.image_views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var btn1 :Button
    lateinit var  btn2 : Button
    lateinit var  image : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 =findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        image =findViewById(R.id.imageView)


        btn1.setOnClickListener {
            image.setImageDrawable(resources.getDrawable(R.drawable.bg11))
        }

        btn2.setOnClickListener {
            image.setImageDrawable(resources.getDrawable(R.drawable.bg2))
        }

    }
}