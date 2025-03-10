package com.example.cse225.splashScreen

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cse225.R
import com.example.cse225.databinding.ActivitySeviceLogInBinding

class SeviceLogIn : AppCompatActivity() {
    private lateinit var binding : ActivitySeviceLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeviceLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}