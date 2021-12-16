package com.rizal.aliefstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_tutorial.*

class Tutorial : AppCompatActivity() {
    val menuTeks= arrayOf("Top Up", "Joki")
    val menuIcon= arrayOf(R.drawable.ic_globe, R.drawable.ic_gift)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)
        val adapter = ViewPagerAdapter(this)
        view_pager.setAdapter(adapter)
        TabLayoutMediator(tab_layout, view_pager,
            TabLayoutMediator.TabConfigurationStrategy{ tab, position ->
                tab.text= menuTeks[position]
                tab.icon= ResourcesCompat.getDrawable(resources, menuIcon[position], null)
            }).attach()
    }
}