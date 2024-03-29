package com.muratozcan.newsapp.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.muratozcan.newsapp.BuildConfig
import com.muratozcan.newsapp.R
import com.muratozcan.newsapp.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.newsNavHostFragment) as NavHostFragment
        val fragment = navHostFragment.childFragmentManager.fragments[0]

        binding.bottomNavigationView.setupWithNavController(fragment.findNavController())

        Log.e("API_KEY", BuildConfig.API_KEY)
    }
}