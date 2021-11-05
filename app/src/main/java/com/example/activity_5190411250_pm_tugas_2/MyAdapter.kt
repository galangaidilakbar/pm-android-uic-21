package com.example.activity_5190411250_pm_tugas_2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context : Activity, private val arrayList: ArrayList<Framework>) : ArrayAdapter<Framework>(context,
                R.layout.list_item,arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item, null)

        val imageView : ImageView = view.findViewById(R.id.framework_pic)
        val frameworkname : TextView = view.findViewById(R.id.frameworkName)
        val frameworkdesc : TextView = view.findViewById(R.id.frameworkDesc)

        imageView.setImageResource(arrayList[position].imageId)
        frameworkname.text = arrayList[position].name
        frameworkdesc.text = arrayList[position].description


        return view
    }

}