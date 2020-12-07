package com.codingfeline.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

class TopFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Lifecycle", "TopFragment - creating")
        super.onCreate(savedInstanceState)

        Log.d("Lifecycle", "TopFragment - created")
    }
}
