package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var btnInc: Button
    lateinit var txtCounter: TextView
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        btnInc = findViewById(R.id.btnInc)
        txtCounter = findViewById(R.id.txtCounter)

        txtCounter.text = mainViewModel.count.toString()

        btnInc.setOnClickListener {
            mainViewModel.increment()
            txtCounter.text = mainViewModel.count.toString()
        }

    }


}