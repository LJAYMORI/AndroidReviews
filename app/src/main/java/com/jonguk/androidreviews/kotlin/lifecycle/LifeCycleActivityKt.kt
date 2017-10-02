package com.jonguk.androidreviews.kotlin.lifecycle

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.jonguk.androidreviews.R
import com.jonguk.androidreviews.utils.BaseActivity
import kotlinx.android.synthetic.main.activity_life_cycle.*

/**
 * Created by Jonguk on 2017. 10. 2..
 */
class LifeCycleActivityKt: BaseActivity() {

    companion object {
        @JvmStatic fun newIntent(context: Context):
                Intent = Intent(context, LifeCycleActivityKt::class.java)
    }

    override fun getLayoutId(): Int = R.layout.activity_life_cycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initViewPager()



    }

    private fun initViewPager() {
        val list = arrayListOf(
                LifeCycleFragmentKt.newInstance("Page 1"),
                LifeCycleFragmentKt.newInstance("Page 2"),
                LifeCycleFragmentKt.newInstance("Page 3"))
        life_cycle_view_pager.adapter = LifeCycleAdapterKt(supportFragmentManager, list)
    }



}