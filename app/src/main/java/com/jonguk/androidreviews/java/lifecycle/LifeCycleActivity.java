package com.jonguk.androidreviews.java.lifecycle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import com.jonguk.androidreviews.R;
import com.jonguk.androidreviews.etc.DummyActivity;
import com.jonguk.androidreviews.etc.DummyDialogFragment;
import com.jonguk.androidreviews.utils.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by Jonguk on 2017. 9. 17..
 */

public class LifeCycleActivity extends BaseActivity {

    private static final String TAG = "LifeCycleActivity";

    @BindView(R.id.life_cycle_container) FrameLayout mContainer;
    @BindView(R.id.life_cycle_view_pager) ViewPager mViewPager;

    public static Intent newIntent(Context context) {
        return new Intent(context, LifeCycleActivity.class);
    }

    @LayoutRes
    @Override
    protected int getLayoutId() {
        return R.layout.activity_life_cycle;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() called");

        initViewPager();

        findViewById(R.id.life_cycle_replace_fragment_button).setOnClickListener(v -> {
            mContainer.setVisibility(View.VISIBLE);
            mViewPager.setVisibility(View.GONE);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.life_cycle_container,
                            LifeCycleFragment.newInstance("Fragment"))
                    .commit();
        });

        findViewById(R.id.life_cycle_replace_viewpager_button).setOnClickListener(v -> {
            mContainer.setVisibility(View.GONE);
            mViewPager.setVisibility(View.VISIBLE);
        });

        findViewById(R.id.life_cycle_dummy_activity_button)
                .setOnClickListener(v -> startActivity(DummyActivity.newIntent(this)));

        findViewById(R.id.life_cycle_crash_button).setOnClickListener(v -> {
            throw new RuntimeException("Intentional Crash");
        });

        findViewById(R.id.life_cycle_alert_dialog_button).setOnClickListener(v ->
                new AlertDialog.Builder(this)
                        .setTitle("Title")
                        .setMessage("Dummy Dialog Message")
                        .create().show());

        findViewById(R.id.life_cycle_dialog_fragment_button).setOnClickListener(v ->
                new DummyDialogFragment().show(getSupportFragmentManager(), "dummy-dialog"));
    }

    private void initViewPager() {
        List<LifeCycleFragment> list = new ArrayList<>(3);
        list.add(LifeCycleFragment.newInstance("Fragment Page 1"));
        list.add(LifeCycleFragment.newInstance("Fragment Page 2"));
        list.add(LifeCycleFragment.newInstance("Fragment Page 3"));
        mViewPager.setAdapter(new LifeCycleAdapter(getSupportFragmentManager(), list));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() called");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState() called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }

}
