package com.rizal.aliefstore

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity){
    private val JUMLAH_MENU = 3
    override fun createFragment(position: Int): Fragment {
        when (position){
            0 ->  {return caratopup()}
            1 -> {return  carajoki()}
            2 -> {return penjoki()}
            else -> (return caratopup())

        }
    }
    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}