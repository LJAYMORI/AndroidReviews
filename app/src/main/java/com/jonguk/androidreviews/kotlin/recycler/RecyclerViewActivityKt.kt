package com.jonguk.androidreviews.kotlin.recycler

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.jonguk.androidreviews.R
import com.jonguk.androidreviews.utils.BaseActivity
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerViewActivityKt : BaseActivity() {

    private val adapter = RecyclerAdapterKt()

    companion object {
        @JvmStatic fun newIntent(context: Context): Intent =
                Intent(context, RecyclerViewActivityKt::class.java)
    }

    override fun getLayoutId(): Int = R.layout.activity_recycler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        recycler.adapter = adapter

        adapter.setItems(createItems())
    }

    private fun createItems(): ArrayList<String> {
        val list = arrayListOf<String>()
        (1..50).mapTo(list) { "item $it" }
        return list
    }

}
