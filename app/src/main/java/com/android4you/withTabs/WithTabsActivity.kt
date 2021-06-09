package com.android4you.withTabs

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.android4you.simple.PagerAdapter
import com.android4you.viewpager2learnings.R
import com.android4you.viewpager2learnings.databinding.ActivityWithtabsBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class WithTabsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityWithtabsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWithtabsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val images = arrayListOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d
        )
        binding.pager.adapter = PagerAdapter(this, images)
        binding.pager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        TabLayoutMediator(binding.tabLayout, binding.pager) {tab, position ->
            tab.text = "${position + 1}"
        }.attach()

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@WithTabsActivity, "Tab ${tab?.text} selected", Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@WithTabsActivity, "Tab ${tab?.text} unselected", Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@WithTabsActivity, "Tab ${tab?.text} reselected", Toast.LENGTH_SHORT).show()
            }
        })

    }


}