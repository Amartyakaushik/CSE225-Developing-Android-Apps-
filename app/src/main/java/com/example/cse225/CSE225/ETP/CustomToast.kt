package com.example.cse225.CSE225.ETP

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.cse225.R
import es.dmoral.toasty.Toasty

class CustomToast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_toast)
    }

    fun showToast(v: View) {
        val id = v.id

        if (id == R.id.button_error) {
            Toasty.error(this, "This is an error Toast", Toast.LENGTH_SHORT).show()
        }
        else if (id == R.id.button_success) {
            Toasty.success(this, "This is a success Toast", Toast.LENGTH_SHORT).show()
        }
        else if (id == R.id.button_info) {
            Toasty.info(this, "This is an info Toast", Toast.LENGTH_SHORT).show()
        }
        else if (id == R.id.button_warning) {
            Toasty.warning(this, "This is a warning Toast", Toast.LENGTH_SHORT).show()
        }
        else if (id == R.id.button_normal) {
            Toasty.normal(
                this, "This is a normal Toast",
                Toast.LENGTH_SHORT,
                ContextCompat.getDrawable(this, R.drawable.avt01)
            ).show()
        }
    }
}