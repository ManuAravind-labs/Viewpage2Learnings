package com.android4you.withfragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.android4you.viewpager2fragments.FragmentA
import com.android4you.viewpager2fragments.FragmentB
import com.android4you.viewpager2fragments.FragmentC

class FragmentSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            FragmentA()
        }else if(position == 1){
            FragmentB()
        }else {
            FragmentC()
        }

    }


}