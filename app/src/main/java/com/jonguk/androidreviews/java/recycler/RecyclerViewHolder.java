package com.jonguk.androidreviews.java.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.jonguk.androidreviews.R;

/**
 * Created by Jonguk on 2017. 10. 2..
 */

class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextView;

    RecyclerViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.recycler_text);
    }

    void bind(String text) {
        mTextView.setText(text);
    }

}
