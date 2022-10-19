package com.android.integratingrust

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        init {
            System.loadLibrary("rust_lib")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val g = RustGreetings()
        val r = g.sayHello("world, ")
        findViewById<TextView>(R.id.testview).text=r
    }
}