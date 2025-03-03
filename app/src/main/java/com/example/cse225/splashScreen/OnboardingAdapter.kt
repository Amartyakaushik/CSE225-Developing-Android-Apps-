package com.example.cse225.splashScreen

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
class OnboardingAdapter {

//class OnboardingAdapter(private val activity: AppCompatActivity) : RecyclerView.Adapter<OnboardingAdapter.OnboardingViewHolder>() {
//    private val activities = listOf(
//        onBoardingActivity::class.java,
//        onBoardingActivity2::class.java,
//        onBoardingActivity3::class.java
//    )
//
////    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnboardingViewHolder {
////        val binding = ItemOnboardingBinding.inflate(LayoutInflater.from(parent.context), parent, false)
////        return OnboardingViewHolder(binding)
////    }
//
//    override fun onBindViewHolder(holder: OnboardingViewHolder, position: Int) {
//        holder.bind(activities[position])
//    }
//
//    override fun getItemCount(): Int = activities.size
//
//    inner class OnboardingViewHolder(private val binding: ItemOnboardingBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//
//        fun bind(activityClass: Class<*>) {
//            binding.root.setOnClickListener {
//                val intent = Intent(binding.root.context, activityClass)
//                binding.root.context.startActivity(intent)
//            }
//        }
//    }
}

