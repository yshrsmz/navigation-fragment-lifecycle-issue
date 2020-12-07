package com.codingfeline.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Lifecycle", "MainActivity - creating")
        super.onCreate(savedInstanceState)

        Log.d("Lifecycle", "MainActivity - created")
    }
}
