package com.example.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel(initialValue: Int) : ViewModel() {

    var count: Int = initialValue

    fun increment() {
        count++
    }

}