package com.example.gohasu.kotlinfun

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

abstract class MainActivity : AppCompatActivity() {

    var count = 0

    fun add (view: View) {
        count ++
        textView.text = count.toString()
    }

    fun reset (view: View) {
        count = 0
        textView.text = count.toString()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var textView = findViewById<TextView>(R.id.textView)

        textView.text = "hello fam"

    }
}
