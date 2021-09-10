package com.example.kotlin1dz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin1dz.databinding.ActivityKotlinBinding
import com.example.kotlin1dz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    companion object {
        const val GET_TEXT = "data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvText2.text = intent.getStringExtra(GET_TEXT) ?: ""
        binding.btnSend.setOnClickListener {
            if (binding.etTextPust.text.trim().toString().isEmpty()) {
                Toast.makeText(this, "EditText не может быть пустым", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(Intent(this, KotlinActivity::class.java).putExtra(GET_TEXT, binding.etTextPust.text.toString()))
            }
        }
    }
}