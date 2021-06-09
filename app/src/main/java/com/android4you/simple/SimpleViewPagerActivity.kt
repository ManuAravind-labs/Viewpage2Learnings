package com.android4you.simple

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.android4you.viewpager2learnings.R
import com.android4you.viewpager2learnings.databinding.ActivityViewpagersimpleBinding

class SimpleViewPagerActivity: AppCompatActivity() {
    private lateinit var binding : ActivityViewpagersimpleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewpagersimpleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = arrayListOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d
        )
        binding.pager.adapter = PagerAdapter(this, images)
        binding. pager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

    }
}