package com.padcx.customcomponentproj.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.padcx.customcomponentproj.fragment.FragmentContact
import com.padcx.customcomponentproj.fragment.FragmentProject
import com.padcx.customcomponentproj.fragment.FragmentUser

class ForPagerAdapter(fm: FragmentManager) :FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return  when(position){
            0->{
                FragmentUser()
            }
            1->{
                FragmentContact()
            }2->{
                FragmentProject()
            }else->{
                FragmentUser()
            }
        }
    }

    override fun getCount(): Int {
       return  3
    }
}