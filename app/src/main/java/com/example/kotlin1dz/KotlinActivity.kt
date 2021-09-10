package com.example.kotlin1dz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin1dz.MainActivity.Companion.GET_TEXT
import com.example.kotlin1dz.databinding.ActivityKotlinBinding
import com.example.kotlin1dz.databinding.ActivityMainBinding

class KotlinActivity : AppCompatActivity() {

    lateinit var binding: ActivityKotlinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKotlinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTextPust2.text = intent.getStringExtra(GET_TEXT).toString()
        binding.btn2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java).putExtra(GET_TEXT, binding.tvTextPust2.text.toString()))
        }
    }
}