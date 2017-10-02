package com.jonguk.androidreviews.java.recycler;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jonguk.androidreviews.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jonguk on 2017. 10. 2..
 */

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private static final String TAG = "RecyclerAdapter";

    private final List<String> mItems = new ArrayList<>();

    void setItems(List<String> list) {
        mItems.clear();
        addItems(list);
    }

    void addItems(List<String> list) {
        mItems.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater
                .from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new RecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.bind(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public void onViewAttachedToWindow(RecyclerViewHolder holder) {
        Log.d(TAG, "onViewAttachedToWindow - position : " +
                (holder != null ? holder.getLayoutPosition() : "no position"));
    }

    @Override
    public void onViewDetachedFromWindow(RecyclerViewHolder holder) {
        Log.d(TAG, "onViewDetachedFromWindow - position : " +
                (holder != null ? holder.getLayoutPosition() : "no position"));
    }

}
