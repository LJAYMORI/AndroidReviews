package com.jonguk.androidreviews.kotlin.recycler

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import com.jonguk.androidreviews.R

/**
 * Created by Jonguk on 2017. 9. 24..
 */
class RecyclerAdapterKt : RecyclerView.Adapter<RecyclerViewHolderKt>() {

    private val TAG = "RecyclerAdapterKt"

    private val mItems = arrayListOf<String>()

    fun setItems(list: ArrayList<String>) {
        mItems.clear()
        addItems(list)
    }

    fun addItems(list: ArrayList<String>) {
        mItems.addAll(list)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = mItems.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerViewHolderKt =
            RecyclerViewHolderKt(LayoutInflater.from(parent?.context)
                    .inflate(R.layout.item_recycler, parent, false))

    override fun onBindViewHolder(holder: RecyclerViewHolderKt?, position: Int) {
        holder?.bind(mItems[position])
    }

    override fun onViewAttachedToWindow(holder: RecyclerViewHolderKt?) {
        Log.d(TAG, "onViewAttachedToWindow - position : " + (holder?.layoutPosition ?: "no position"))
    }

    override fun onViewDetachedFromWindow(holder: RecyclerViewHolderKt?) {
        Log.d(TAG, "onViewDetachedFromWindow - position : " + (holder?.layoutPosition ?: "no position"))
    }
}