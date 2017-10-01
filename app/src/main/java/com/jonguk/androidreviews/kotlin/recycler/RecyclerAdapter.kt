package com.jonguk.androidreviews.kotlin.recycler

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import com.jonguk.androidreviews.R

/**
 * Created by Jonguk on 2017. 9. 24..
 */
class RecyclerAdapter : RecyclerView.Adapter<RecyclerViewHolder>() {

    private val TAG = "RecyclerAdapter"

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

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerViewHolder =
            RecyclerViewHolder(LayoutInflater.from(parent?.context)
                    .inflate(R.layout.item_recycler, parent, false))

    override fun onBindViewHolder(holder: RecyclerViewHolder?, position: Int) {
        holder?.bind(mItems[position])
    }

    override fun onViewAttachedToWindow(holder: RecyclerViewHolder?) {
        Log.d(TAG, "onViewAttachedToWindow - position : " + (holder?.layoutPosition ?: "no position"))
    }

    override fun onViewDetachedFromWindow(holder: RecyclerViewHolder?) {
        Log.d(TAG, "onViewDetachedFromWindow - position : " + (holder?.layoutPosition ?: "no position"))
    }
}