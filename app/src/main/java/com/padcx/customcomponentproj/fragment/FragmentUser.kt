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
import kotlinx.android.synthetic.main.fragment_user.*

class FragmentUser : Fragment() {

    private lateinit var mAdapter : FragmentUserRecyclerAdapter
    private lateinit var viewPager : ViewPager
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        mAdapter = FragmentUserRecyclerAdapter()
//       val linearLayoutManager =LinearLayoutManager(activity)
//        rcFragmentUser.layoutManager = linearLayoutManager
//        rcFragmentUser.adapter = mAdapter
        return inflater.inflate(R.layout.fragment_user,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mAdapter = FragmentUserRecyclerAdapter()
        rcFragmentUser.layoutManager = LinearLayoutManager(activity)
        rcFragmentUser.adapter = mAdapter
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        mPagerAdapter = FragmentPagerAdapter(FragmentUser)
//        viewPager = view.findViewById(R.id.pager)
//        viewPager.adapter = mPagerAdapter
//    }
//    companion object {
//
//        @JvmStatic
//        fun newInstance() =
//            FragmentUser().apply {
//
//            }
   // }


}