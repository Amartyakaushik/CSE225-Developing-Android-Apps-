package com.example.cse225.CSE225.ETP

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.cse225.R

class AlarmManager : AppCompatActivity() {
//    private lateinit var binding : BindingAla
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alarm_manager)

        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager // android.app
        val intent = Intent(this, Unit::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_IMMUTABLE)
        val triggerTime = System.currentTimeMillis() + 10_000
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, triggerTime, pendingIntent)
    }
}