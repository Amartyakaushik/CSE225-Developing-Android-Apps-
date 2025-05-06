package com.example.cse225.CSE225

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cse225.R

class ETP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_etp)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
// -----------------------------------------------------Footer
//package org.geeksforgeeks.listviewlfooter
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.ViewGroup
//import android.widget.ArrayAdapter
//import android.widget.ListView
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        // Declaring and initializing
//        // the ListView from the layout file
//        val mListView = findViewById<ListView>(R.id.list_view_1)
//
//        // Declaring a list of items
//        val mItems = arrayOf(
//            "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
//            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20")
//
//        // Creating an adapter for ListView
//        val mAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, mItems)
//
//        // Inflating the Footer file
//        val mFooter = layoutInflater.inflate(R.layout.footer, mListView, false) as ViewGroup
//
//        // Adding the footer to the ListView
//        mListView.addFooterView(mFooter)
//
//        // Setting the adapter
//        mListView.adapter = mAdapter
//    }
//}

// --------------------------------------------------------- pending intent
//val pendingIntent =
//    PendingIntent.getActivity(
//        context,
//        /* requestCode = */ 0,
//        Intent(intentAction),
//        PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_ONE_SHOT)

//-----------------------------------------------------------