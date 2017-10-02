package com.jonguk.androidreviews.java.recycler;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;

import com.jonguk.androidreviews.R;
import com.jonguk.androidreviews.utils.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by Jonguk on 2017. 10. 2..
 */

public class RecyclerViewActivity extends BaseActivity {

    @BindView(R.id.recycler) RecyclerView mRecyclerView;
    private RecyclerAdapter mAdapter;

    public static Intent newIntent(Context context) {
        return new Intent(context, RecyclerViewActivity.class);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_recycler;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mAdapter = new RecyclerAdapter();
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setItems(createItems());
    }

    private List<String> createItems() {
        int size = 50;
        List<String> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add("item " + i);
        }
        return list;
    }

}
