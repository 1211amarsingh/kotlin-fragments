package com.mobapptuts.kotlinfragments

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by nigelhenshaw on 2018/01/24.
 */
class ImageFragmentPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FirstImageFragment.newInstance()
            1 -> SecondImageFragment.newInstance()
            2 -> ThirdImageFragment.newInstance()
            else -> FirstImageFragment.newInstance()
        }
    }

    override fun getCount() = 3
}