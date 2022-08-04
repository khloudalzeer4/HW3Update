package com.exmple.hw3update

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addButton: Button = findViewById(R.id.add_ptn)
        val numberCount: TextView = findViewById(R.id.txt_number)
        var increment: Int = 0;
        addButton.setOnClickListener {
            val toast =
                Toast.makeText(this, "count number:" + increment.toString(), Toast.LENGTH_SHORT)
            increment++;
            toast.setGravity(Gravity.TOP, 1, 0)
            numberCount.text = increment.toString() + "";
            toast.show()
        }
}}