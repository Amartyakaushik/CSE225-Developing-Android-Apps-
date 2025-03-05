package com.example.cse225.splashScreen

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.cse225.MainActivity
import com.example.cse225.R
import com.example.cse225.databinding.ActivityOnBoardingBinding
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator

class onBoardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoardingBinding
    private lateinit var viewPager: ViewPager2
    private lateinit var dotsIndicator: WormDotsIndicator

    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize ViewPager2 and DotsIndicator
//        viewPager = findViewById(R.id.viewPager)
        dotsIndicator = findViewById(R.id.dotsLayout)

        // Set an adapter for the ViewPager2
//        val adapter = OnboardingAdapter(this)
//        viewPager.adapter = adapter

//        val adapter = ViewPagerAdapter()
        // Attach DotsIndicator to ViewPager2
        dotsIndicator.attachTo(viewPager)

        // Next and Skip button setup
        val nextBtn = binding.buttonNext
        val skipBtn = binding.buttonSkip

        nextBtn.setOnClickListener {
            if (viewPager.currentItem < 2) {  // 2 is the last page index (for example)
                viewPager.currentItem = viewPager.currentItem + 1
            }
        }


        skipBtn.setOnClickListener{
            // Set the onboarding completion flag to true when the user skips the onBoarding screen
            val sharedPreferences = getSharedPreferences("app_preferences", MODE_PRIVATE)
            sharedPreferences.edit().putBoolean("is_onboarding_completed", true).apply()
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
