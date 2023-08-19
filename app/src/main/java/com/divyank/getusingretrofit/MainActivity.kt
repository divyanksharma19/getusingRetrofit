package com.divyank.getusingretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textview)
        val QuotesApi = RetrofitBuilder.getInstance().create(myInterface::class.java)
        GlobalScope.launch {
            val result = QuotesApi.getQuotes()
            if(result != null){
                Log.d("Result",result.body().toString())
                textView.text = result.toString()
            }
        }
    }
}