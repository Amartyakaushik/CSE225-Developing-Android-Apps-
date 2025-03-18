package com.example.cse225

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import com.example.cse225.databinding.ActivityMainBinding
import com.example.cse225.extra.RetrofitBuilder
import com.example.cse225.extra.myInterface
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val quoteApi = RetrofitBuilder.getInstance().create(myInterface::class.java)
//        Lifecycle
        GlobalScope.launch {
            val result = quoteApi.getQuotes()
            try{
                if(result != null){
                    Log.d("Result", result.body().toString())
                }else{
                    Log.d("Result", result.body().toString())
                }
            }catch (e: Exception){
                Log.e("Result", "Error: ${e.localizedMessage}" )
            }
        }
    }
}