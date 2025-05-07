package com.example.cse225.CSE225.ETP

import android.app.job.JobParameters
import android.app.job.JobService
import android.util.Log
import android.widget.Toast

class MyJobScheduler : JobService() {
    override fun onStartJob(p0: JobParameters?): Boolean {
        Toast.makeText(this, "Job Started", Toast.LENGTH_SHORT).show()
        Thread{
            Thread.sleep(3000)
            jobFinished(p0, false)
            Log.d("JobSevice", "onStartJob: job started")
        }.start()
        return true
    }

    override fun onStopJob(p0: JobParameters?): Boolean {
        Toast.makeText(this, "job finished", Toast.LENGTH_SHORT).show()
        Log.d("JobSevice", "onStartJob: job started")
        return true
    }
}