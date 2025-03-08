package com.example.cse225.CSE225

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cse225.MainActivity
import com.example.cse225.R
import com.example.cse225.databinding.ActivityNotificationBinding

class Notification : AppCompatActivity() {
    private lateinit var binding: ActivityNotificationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
//    @RequiresApi(Build.VERSION_CODES.O)
//    private fun createNotification(){
//        val channelId = "Notification_Channel"
////        if(Build.VERSION_sdk)
//        val name = "Android Developer"
//        val descriptionText = "Click Here"
//        val importance = NotificationManager.IMPORTANCE_DEFAULT
//        val chaneel = NotificationChannel(channelId, name, importance).apply {
//            description = descriptionText
//        }
//
//        val notificationManager : NotificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
//        notificationManager.createNotificationChannels(chaneel)
//    }
private fun createNotificationChannel() {
    // Create the NotificationChannel, but only on API 26+ because
    // the NotificationChannel class is not in the Support Library.
    val CHANNEL_ID = "Notification_Channel"
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val name = "Android Developer"
        val descriptionText = "Click Here"
        val importance = NotificationManager.IMPORTANCE_DEFAULT
        val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
            description = descriptionText
        }
        // Register the channel with the system.
        val notificationManager: NotificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)
    }
}

    fun showNotification(){
        val chaneel_id = "Notification_Channel"
        val intent = Intent(this, MainActivity::class.java)
//        val pendingIntent = PendingIntent
    }
}