package com.example.activity_5190411250_pm_tugas_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activity_5190411250_pm_tugas_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var frameworkArrayList: ArrayList<Framework>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.img_laravel,R.drawable.img_node,R.drawable.img_vue,R.drawable.img_react,
            R.drawable.img_bootstrap
        )

        val name = arrayOf(
            "Laravel",
            "Node JS",
            "Vue JS",
            "React",
            "Bootstrap"
        )

        val desc = arrayOf(
            "Laravel is primarily used for building custom web apps using PHP.",
            "Node.js® is a JavaScript runtime built on Chrome's V8 JavaScript engine.",
            "Vue.js is a progressive framework for building user interfaces.",
            "React is a declarative, efficient, and flexible JavaScript library for building user interfaces.",
            "The world’s most popular front-end open source toolkit.",
        )

        frameworkArrayList = ArrayList()

        for (i in name.indices){
            val framework = Framework(name[i],desc[i],imageId[i])
            frameworkArrayList.add(framework)
        }
        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this, frameworkArrayList)
        binding.listview.setOnItemClickListener {parent, view, position, id ->

            val name = name[position]
            val desc = desc[position]
            val imageId = imageId[position]

            val i = Intent(this, DetailFramework::class.java)
            i.putExtra("name", name)
            i.putExtra("desc", desc)
            i.putExtra("imageId", imageId)

            startActivity(i)
        }
    }
}