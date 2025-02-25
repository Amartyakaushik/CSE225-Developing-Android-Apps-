package com.example.cse225.CSE225

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.cse225.databinding.ActivityRatingBarBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RatingBar : AppCompatActivity() {
    private lateinit var binding : ActivityRatingBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRatingBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val res = binding.res
        val submitBtn = binding.submitBtn
        val ratingbar = binding.rating
        val progressBar = binding.progressBar

        submitBtn.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            lifecycleScope.launch {
                delay(1500)
                progressBar.visibility = View.GONE
                    res.visibility = View.VISIBLE






                ratingbar.setOnRatingBarChangeListener { ratingBar, fl, b ->
                    res.setText("You Rated : ${fl} stars")
                }
            }
//            res.setText("You Rated: " + progress.onRatingBarChangeListener)
//            res.setText("You Rated: " + progress.rating.toString())
        }
//        LayerDrawable star = (LayerDrawable) progress.
//        LayerDrawable star = (LayerDrawable)
//        submitBtn.setOnClickListener( view -> {
//            res.setText("You Rated : "+progress.getRating());
//        });
    }
}