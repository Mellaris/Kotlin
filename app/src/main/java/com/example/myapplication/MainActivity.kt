package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.window.SplashScreen
import androidx.fragment.app.commit


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       supportFragmentManager.commit {
           setReorderingAllowed(true)
           replace(R.id.fragment_host, SpalshScreen())
       }
        setContentView(R.layout.activity_main)

    }
}