package com.example.activity_5190411250_pm_tugas_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailFramework : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_framework)

        val fh = intent.getStringExtra("name")

        val textView = findViewById<TextView>(R.id.frame_header).apply{
            text = fh
        }

        val fd = intent.getStringExtra("desc")

        val textView2 = findViewById<TextView>(R.id.frame_desc).apply {
            text = fd
        }

        val fp = intent.getIntExtra("imageId", R.drawable.img_laravel)

        val imageView = findViewById<ImageView>(R.id.frame_pic).apply {
            setImageResource(fp)
        }

    }
}