package com.android4you.withfragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android4you.viewpager2learnings.databinding.ActivityViewpagerFragmentsBinding

class WithFragmentsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityViewpagerFragmentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewpagerFragmentsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // The pager adapter, which provides the pages to the view pager widget.
        val pagerAdapter = FragmentSlidePagerAdapter(this)
        binding.pager.adapter = pagerAdapter
    }
}