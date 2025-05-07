package com.example.cse225.CSE225.ETP

import android.app.job.JobInfo
import android.content.ComponentName
import android.content.Context
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cse225.R
import com.example.cse225.databinding.ActivityAlarmManagerBinding

class JobScheduler : AppCompatActivity() {
    private lateinit var binding: ActivityAlarmManagerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAlarmManagerBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_job_scheduler)

        val jobScheduler = getSystemService(Context.JOB_SCHEDULER_SERVICE) as JobScheduler

//        binding.btn
        findViewById<Button>(R.id.btnScheduleJob).setOnClickListener {
            val jobInfo = JobInfo.Builder(123,
                ComponentName(this, MyJobScheduler::class.java))
                .setRequiresCharging(true)
                .setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
                .setOverrideDeadline(3000)
                .build()

            jobScheduler.schedule(jobInfo)
        }
    }
}