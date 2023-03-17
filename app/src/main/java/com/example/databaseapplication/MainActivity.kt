package com.example.databaseapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databaseapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dbHelper = MyDatabaseHelper(this, "BookStore.db", 2)
        binding.createDatabaseButton.setOnClickListener {
            dbHelper.writableDatabase
        }
    }
}