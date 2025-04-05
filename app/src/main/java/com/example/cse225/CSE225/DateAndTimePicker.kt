package com.example.cse225.CSE225

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.cse225.databinding.ActivityDateAndTimePickerBinding
import java.util.*

class DateAndTimePicker : AppCompatActivity() {
    private val myBirthday = Calendar.getInstance().apply { set(2004, Calendar.NOVEMBER, 1) }
    private val classSchedule = listOf(
        Calendar.getInstance().apply { set(2025, Calendar.APRIL, 3,12, 0) },
        Calendar.getInstance().apply { set(2025, Calendar.APRIL, 10, 10, 30) },
        Calendar.getInstance().apply { set(2025, Calendar.MAY, 10, 10, 30) }
    )

    private var selectedDate: Calendar = Calendar.getInstance()
    private lateinit var txtResult : TextView
    private lateinit var btnPickDataAndTime : Button
    private lateinit var binding: ActivityDateAndTimePickerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDateAndTimePickerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        txtResult = binding.txtResult
        btnPickDataAndTime = binding.btnPickDateTime
        btnPickDataAndTime.setOnClickListener {
            pickDate()
        }
        supportActionBar


    }

    private fun pickDate() {
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        // Date Picker
        DatePickerDialog(this, { _, selectedYear, selectedMonth, selectedDay ->
            selectedDate = Calendar.getInstance().apply {
                set(selectedYear, selectedMonth, selectedDay)
            }
            pickTime() // Proceed to time selection

        }, year, month, day).show()
    }

    private fun pickTime() {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        // Time Picker
        TimePickerDialog(this, { _, selectedHour, selectedMinute ->
            selectedDate.set(Calendar.HOUR_OF_DAY, selectedHour)
            selectedDate.set(Calendar.MINUTE, selectedMinute)

            checkDateTime(selectedDate)

        }, hour, minute, false).show()
    }

    private fun checkDateTime(selectedDateTime: Calendar) {
        when {
            isSameDay(selectedDateTime, myBirthday) -> {
                txtResult.text = "🎉 Happy Birthday! 🎂"
                Toast.makeText(this, "Enjoy your day! 🎊", Toast.LENGTH_SHORT).show()
            }
            classSchedule.any { isSameDateTime(it, selectedDateTime) } -> {
                txtResult.text = "📅 You have a class at ${selectedDateTime.get(Calendar.HOUR_OF_DAY)}:${selectedDateTime.get(Calendar.MINUTE)}!"
                Toast.makeText(this, "Class Reminder: Don't be late!", Toast.LENGTH_SHORT).show()
            }
            else -> {
                txtResult.text = "❌ No class scheduled at this time."
            }
        }
    }

    private fun isSameDay(cal1: Calendar, cal2: Calendar): Boolean {
        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
                cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH)
    }

    private fun isSameDateTime(cal1: Calendar, cal2: Calendar): Boolean {
        return isSameDay(cal1, cal2) &&
                cal1.get(Calendar.HOUR_OF_DAY) == cal2.get(Calendar.HOUR_OF_DAY) &&
                cal1.get(Calendar.MINUTE) == cal2.get(Calendar.MINUTE)
    }
}