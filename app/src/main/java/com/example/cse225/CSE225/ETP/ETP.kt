package com.example.cse225.CSE225.ETP

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

//----------------------------------------------------------- NOti
//class MainActivity : AppCompatActivity() {
//
//    private val CHANNEL_ID = "my_channel_id"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        createNotificationChannel()
//
//        val button = findViewById<Button>(R.id.notifyBtn)
//        button.setOnClickListener {
//            showNotification()
//        }
//    }
//
//    private fun showNotification() {
//        val intent = Intent(this, SecondActivity::class.java)
//        val pendingIntent = PendingIntent.getActivity(
//            this, 0, intent,
//            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
//        )
//
//        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
//            .setSmallIcon(R.drawable.ic_notification) // Add an icon in drawable
//            .setContentTitle("Hello User!")
//            .setContentText("Tap to open SecondActivity")
//            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//            .setContentIntent(pendingIntent)
//            .setAutoCancel(true)
//
//        val notificationManager = NotificationManagerCompat.from(this)
//        notificationManager.notify(101, builder.build())
//    }
//
//    private fun createNotificationChannel() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            val name = "My Channel"
//            val descriptionText = "Channel for notifications"
//            val importance = NotificationManager.IMPORTANCE_DEFAULT
//            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
//                description = descriptionText
//            }
//
//            val notificationManager: NotificationManager =
//                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//            notificationManager.createNotificationChannel(channel)
//        }
//    }
//}

// ---------------------------------------------------------------storage
//--------------Shared prefere
//val sharedPreferences = getSharedPreferences("MyPreferences", Context.MODE_PRIVATE)
//val editor = sharedPreferences.edit()
//editor.putString("username", "amartya")
//editor.putInt("age", 23)
//editor.apply()  // Commit changes
//
//// Read data
//val sharedPreferences = getSharedPreferences("MyPreferences", Context.MODE_PRIVATE)
//val username = sharedPreferences.getString("username", "default")
//val age = sharedPreferences.getInt("age", 0)
//
//Log.d("SharedPreferences", "Username: $username, Age: $age")

//-----------------Internal storage
                           // write
//val filename = "myfile.txt"
//val fileContents = "Hello, this is my file data."
//try {
//    openFileOutput(filename, Context.MODE_PRIVATE).use {
//        it.write(fileContents.toByteArray())
//    }
//    Toast.makeText(this, "File saved", Toast.LENGTH_SHORT).show()
//} catch (e: Exception) {
//    e.printStackTrace()
//}
                                  //read
//val filename = "myfile.txt"
//try {
//    val fileInputStream = openFileInput(filename)
//    val inputStreamReader = InputStreamReader(fileInputStream)
//    val bufferedReader = BufferedReader(inputStreamReader)
//    val stringBuilder = StringBuilder()
//    var line: String?
//    while (bufferedReader.readLine().also { line = it } != null) {
//        stringBuilder.append(line).append("\n")
//    }
//    val fileContents = stringBuilder.toString()
//    Log.d("InternalStorage", fileContents)
//} catch (e: FileNotFoundException) {
//    e.printStackTrace()
//}

//-------------------------------External
//<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
//
//val file = File(Environment.getExternalStorageDirectory(), "myfile.txt")
//try {
//    FileOutputStream(file).use {
//        it.write("Hello from external storage".toByteArray())
//    }
//    Toast.makeText(this, "File written to external storage", Toast.LENGTH_SHORT).show()
//} catch (e: IOException) {
//    e.printStackTrace()
//}

//val file = File(Environment.getExternalStorageDirectory(), "myfile.txt")
//try {
//    val fileInputStream = FileInputStream(file)
//    val inputStreamReader = InputStreamReader(fileInputStream)
//    val bufferedReader = BufferedReader(inputStreamReader)
//    val stringBuilder = StringBuilder()
//    var line: String?
//    while (bufferedReader.readLine().also { line = it } != null) {
//        stringBuilder.append(line).append("\n")
//    }
//    val fileContents = stringBuilder.toString()
//    Log.d("ExternalStorage", fileContents)
//} catch (e: FileNotFoundException) {
//    e.printStackTrace()
//}

//-----------------------------------------------------4. Runtime Permissions (Accessing Storage)
//if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
//    ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), 1)
//} else {
//    // Permission granted, proceed with file operations
//}

/////////// ---------0r
//override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
//    super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//    if (requestCode == 1 && grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//        // Permission granted, perform the operation
//    } else {
//        // Permission denied
//        Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show()
//    }
//}

//--------------------------------------------- view page
//class TabFragment : Fragment() {
//
//    private var tabNumber: Int? = null
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val binding = FragmentTabBinding.inflate(inflater, container, false)
//        tabNumber = arguments?.getInt("tabNumber")
//
//        // Set content based on tab number
//        binding.textView.text = "This is Tab $tabNumber"
//        return binding.root
//    }
//
//    companion object {
//        fun newInstance(tabNumber: Int): TabFragment {
//            val fragment = TabFragment()
//            val bundle = Bundle()
//            bundle.putInt("tabNumber", tabNumber)
//            fragment.arguments = bundle
//            return fragment
//        }
//    }
//}

//class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
//        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
//
//        val adapter = ViewPagerAdapter(this)
//        viewPager.adapter = adapter
//
//        // Link TabLayout and ViewPager2
//        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
//            tab.text = "Tab ${position + 1}"
//        }.attach()
//    }
//
//    class ViewPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
//        override fun getItemCount(): Int = 3  // Number of tabs
//
//        override fun createFragment(position: Int): Fragment {
//            return TabFragment.newInstance(position + 1)  // Send tab number as argument
//        }
//    }
//}


// ------------------------------------------------------------- Drawer
// main
//<?xml version="1.0" encoding="utf-8"?>
//<androidx.drawerlayout.widget.DrawerLayout xmlns:android="http://schemas.android.com/apk/res/android"
//xmlns:tools="http://schemas.android.com/tools"
//android:id="@+id/drawer_layout"
//android:layout_width="match_parent"
//android:layout_height="match_parent"
//tools:context=".MainActivity">
//
//<FrameLayout
//android:id="@+id/content_frame"
//android:layout_width="match_parent"
//android:layout_height="match_parent"/>
//
//<com.google.android.material.navigation.NavigationView
//android:id="@+id/nav_view"
//android:layout_width="wrap_content"
//android:layout_height="match_parent"
//android:layout_gravity="start"
//app:menu="@menu/navigation_menu"/>
//
//</androidx.drawerlayout.widget.DrawerLayout>

//<?xml version="1.0" encoding="utf-8"?>
//<menu xmlns:android="http://schemas.android.com/apk/res/android">
//<item android:id="@+id/nav_home"
//android:title="Home" />
//<item android:id="@+id/nav_settings"
//android:title="Settings" />
//<item android:id="@+id/nav_logout"
//android:title="Logout" />
//</menu>
//
//class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
//        val navView = findViewById<NavigationView>(R.id.nav_view)
//
//        val actionBarDrawerToggle = ActionBarDrawerToggle(
//            this, drawerLayout, R.string.openDrawer, R.string.closeDrawer
//        )
//        drawerLayout.addDrawerListener(actionBarDrawerToggle)
//        actionBarDrawerToggle.syncState()
//
//        navView.setNavigationItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.nav_home -> {
//                    // Handle Home click
//                }
//                R.id.nav_settings -> {
//                    // Handle Settings click
//                }
//                R.id.nav_logout -> {
//                    // Handle Logout click
//                }
//            }
//            drawerLayout.closeDrawer(GravityCompat.START)
//            true
//        }
//    }
//}
