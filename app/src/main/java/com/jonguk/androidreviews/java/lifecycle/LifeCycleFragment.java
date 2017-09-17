package com.jonguk.androidreviews.java.lifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jonguk.androidreviews.R;
import com.jonguk.androidreviews.utils.BaseFragment;

import butterknife.BindView;

/**
 * Created by Jonguk on 2017. 9. 17..
 */

public class LifeCycleFragment extends BaseFragment {

    private static final String TAG = "lc-fragment";
    private static final String EXTRA_TEXT = "text";

    @BindView(R.id.life_cycle_text) TextView mTextView;
    private String mText;

    public static LifeCycleFragment newInstance(String text) {
        LifeCycleFragment fragment = new LifeCycleFragment();
        Bundle args = new Bundle();
        args.putString(EXTRA_TEXT, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Bundle args = getArguments();
        if (args != null) {
            mText = args.getString(EXTRA_TEXT, "Hello world");
        }
        Log.d(TAG, "onAttach() called - " + mText);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() called - " + mText);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView() called - " + mText);
        return inflater.inflate(R.layout.fragment_life_cycle, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated() called - " + mText);
        mTextView.setText(mText);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called - " + mText);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called - " + mText);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called - " + mText);
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called - " + mText);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called - " + mText);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG, "onDestroyView() called - " + mText);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach() called - " + mText);
    }
    
}
