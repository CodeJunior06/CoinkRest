package com.codejunior.coinkrest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(1500)
        setTheme(R.style.splash)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}