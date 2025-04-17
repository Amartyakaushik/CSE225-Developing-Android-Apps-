package com.example.cse225.CSE225.storage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cse225.Manifest
import com.example.cse225.R
import
import com.example.cse225.databinding.ActivityExternalStorageBinding
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException

class ExternalStorage : AppCompatActivity() {
    private lateinit var binding: ActivityExternalStorageBinding
    lateinit var uname : EditText
    lateinit var password : EditText
    lateinit var btn : Button
    lateinit var fstream : FileOutputStream
    private var filename = "SampleFile.txt"
    private var filePath = "MyFileStorage"
    lateinit var myExternalFile : File
    var mPermission = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityExternalStorageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        uname = binding.userName
        password = binding.pass
        btn = binding.btnSave
        btn.setOnClickListener {
            val userName = """
                ${uname.text}
                """.trimIndent()
            val password = password.text.toString()
            try {
                if(userName.isEmpty() || password.isEmpty())
                    Toast.makeText(this,"either of field is empty", Toast.LENGTH_SHORT).show()
                else{
                    myExternalFile = File(getExternalFilesDir(filePath),filename)
                    fstream = FileOutputStream(myExternalFile)
                    fstream.write(userName.toByteArray())
                    fstream.write(password.toByteArray())
                    fstream.close()
                    Toast.makeText(applicationContext, "Details saved in " + myExternalFile!!.absolutePath, Toast.LENGTH_SHORT).show()
                    intent = Intent(this, ExternalStorage::class.java)
                    startActivity(intent)
                }
            }catch(e : FileNotFoundException){
                e.printStackTrace()
            }catch (e :IOException){
                e.printStackTrace()
            }
        }


    }
}