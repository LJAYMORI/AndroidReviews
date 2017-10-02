package com.jonguk.androidreviews.kotlin.lifecycle

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by Jonguk on 2017. 10. 2..
 */
class LifeCycleAdapterKt(
        fm: FragmentManager,
        list: List<LifeCycleFragmentKt>): FragmentPagerAdapter(fm) {

    private val mItems: List<LifeCycleFragmentKt> = list

    override fun getItem(position: Int): Fragment = mItems[position]

    override fun getCount(): Int = mItems.size
}