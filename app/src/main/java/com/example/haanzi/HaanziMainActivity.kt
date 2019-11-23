package com.example.haanzi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.haanzi.databinding.ActivityMainBinding

class HaanziMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }
}
