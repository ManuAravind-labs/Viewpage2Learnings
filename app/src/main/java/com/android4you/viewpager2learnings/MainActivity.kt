package com.android4you.viewpager2learnings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android4you.simple.SimpleViewPagerActivity
import com.android4you.viewpager2learnings.databinding.ActivityMainBinding
import com.android4you.withTabs.WithTabsActivity
import com.android4you.withfragments.WithFragmentsActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.simpleViewpager.setOnClickListener {
            Intent(this, SimpleViewPagerActivity::class.java).apply {
                startActivity(this)
            }
        }


        binding.viewpagerWithFragments.setOnClickListener {
            Intent(this, WithFragmentsActivity::class.java).apply {
                startActivity(this)
            }
        }


        binding.withTabs.setOnClickListener {
            Intent(this, WithTabsActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}