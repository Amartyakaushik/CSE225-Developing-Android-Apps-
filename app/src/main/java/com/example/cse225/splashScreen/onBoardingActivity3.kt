package com.example.cse225.splashScreen

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cse225.R
import com.example.cse225.databinding.ActivityOnBoarding2Binding
import com.example.cse225.databinding.ActivityOnBoarding3Binding
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator

class onBoardingActivity3 : AppCompatActivity() {
        private lateinit var binding: ActivityOnBoarding3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityOnBoarding3Binding.inflate(layoutInflater)
            setContentView(binding.root)



        val dotsIndicator = findViewById<WormDotsIndicator>(R.id.dotsLayout)
        // Get the page number passed from the previous activity
        val pageNumber = intent.getIntExtra("PAGE_NUMBER", 0)

        // Update the dots indicator based on the page number
        dotsIndicator.setProgress(pageNumber)  // This will highlight the dot corresponding to the page


        val nextBtn = binding.buttonNext
        val skipBtn = binding.buttonSkip
        nextBtn.setOnClickListener{val intent = Intent(this, onBoardingActivity3::class.java)
            intent.putExtra("PAGE_NUMBER", 2)  // Passing page number
            startActivity(intent)
        }
        skipBtn.setOnClickListener{
            startActivity(Intent(this, SplashScreen::class.java))
        }


    }
}