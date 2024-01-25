package com.example.whatsappclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.whatsappclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_bar_menu, menu)
        return true
    }
}