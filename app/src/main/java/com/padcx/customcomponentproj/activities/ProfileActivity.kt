package com.padcx.customcomponentproj.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.padcx.customcomponentproj.R
import com.padcx.customcomponentproj.adapters.ForPagerAdapter

class ProfileActivity : AppCompatActivity() {

    var tablayout : TabLayout? = null
    var viewPager : ViewPager? = null
    companion object{
        fun newIntent(context: Context):Intent{

            val intent = Intent(context,ProfileActivity::class.java)
            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        tablayout= findViewById(R.id.tabs)
        viewPager = findViewById(R.id.pager)

        tablayout!!.addTab(tablayout!!.newTab().setText("ProjectTasks"))
        tablayout!!.addTab(tablayout!!.newTab().setText("Contacts"))
        tablayout!!.addTab(tablayout!!.newTab().setText("Projects"))
        tablayout!!.tabGravity = TabLayout.GRAVITY_FILL

        val adapter = ForPagerAdapter(supportFragmentManager)
        viewPager!!.adapter = adapter

        tablayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabSelected(tab: TabLayout.Tab) {
               viewPager!!.currentItem = tab.position
            }

        })



    }
}
