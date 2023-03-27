package com.example.termproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFrag()

    }

    private fun addFrag(){
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView_main, MapFragment())
            .commit()
    }

}