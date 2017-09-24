package com.jonguk.androidreviews;

import android.os.Bundle;

import com.jonguk.androidreviews.java.lifecycle.LifeCycleActivity;
import com.jonguk.androidreviews.kotlin.recycler.RecyclerViewActivity;
import com.jonguk.androidreviews.utils.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 01. Life cycle
        findViewById(R.id.main_life_cycle_button).setOnClickListener(v ->
                startActivity(LifeCycleActivity.newIntent(this)));

        // 02. Recycler View
        findViewById(R.id.main_recyclerview_button).setOnClickListener(v ->
                startActivity(RecyclerViewActivity.newIntent(this)));

    }

}
