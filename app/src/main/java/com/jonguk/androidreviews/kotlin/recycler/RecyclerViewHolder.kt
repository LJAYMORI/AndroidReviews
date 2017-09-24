package com.jonguk.androidreviews.kotlin.recycler

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_recycler.view.*

/**
 * Created by Jonguk on 2017. 9. 24..
 */
class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(text: String) {
        itemView.recycler_text.text = text
    }
}