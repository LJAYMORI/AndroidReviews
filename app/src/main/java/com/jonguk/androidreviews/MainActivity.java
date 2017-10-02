package com.jonguk.androidreviews;

import android.os.Bundle;

import com.jonguk.androidreviews.java.lifecycle.LifeCycleActivity;
import com.jonguk.androidreviews.java.recycler.RecyclerViewActivity;
import com.jonguk.androidreviews.kotlin.lifecycle.LifeCycleActivityKt;
import com.jonguk.androidreviews.kotlin.recycler.RecyclerViewActivityKt;
import com.jonguk.androidreviews.utils.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Java
        // 01. Life cycle
        findViewById(R.id.main_java_life_cycle_button).setOnClickListener(v ->
                startActivity(LifeCycleActivity.newIntent(this)));

        // 02. Recycler View
        findViewById(R.id.main_java_recyclerview_button).setOnClickListener(v ->
                startActivity(RecyclerViewActivity.newIntent(this)));



        // Kotlin
        // 01. Life cycle
        findViewById(R.id.main_kotlin_life_cycle_button).setOnClickListener(v ->
                startActivity(LifeCycleActivityKt.newIntent(this)));

        // 02. Recycler View
        findViewById(R.id.main_kotlin_recyclerview_button).setOnClickListener(v ->
                startActivity(RecyclerViewActivityKt.newIntent(this)));

    }

}
