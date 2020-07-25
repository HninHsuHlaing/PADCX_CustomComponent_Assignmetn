package com.padcx.customcomponentproj.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.padcx.customcomponentproj.R
import com.padcx.customcomponentproj.adapters.ForPagerAdapter
import com.padcx.customcomponentproj.adapters.FragmentUserRecyclerAdapter
import kotlinx.android.synthetic.main.fragment_contact.*
import kotlinx.android.synthetic.main.fragment_project.*

class FragmentProject : Fragment() {

    private lateinit var mAdapter : FragmentUserRecyclerAdapter
    private lateinit var  viewPager : ViewPager
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  inflater.inflate(R.layout.fragment_project,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mAdapter = FragmentUserRecyclerAdapter()
        rcFragmentProject.layoutManager = LinearLayoutManager(activity)
        rcFragmentProject.adapter = mAdapter
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        mPagerAdapter = FragmentPagerAdapter(FragmentProject)
//    }
//    companion object {
//
//        @JvmStatic
//        fun newInstance() =
//            FragmentProject().apply {
//
//            }
//    }
}