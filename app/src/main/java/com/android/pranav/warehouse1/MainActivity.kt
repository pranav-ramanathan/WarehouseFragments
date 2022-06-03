package com.android.pranav.warehouse1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.pranav.warehouse1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}