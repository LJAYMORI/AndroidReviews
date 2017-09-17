package com.jonguk.androidreviews.java.lifecycle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jonguk on 2017. 9. 17..
 */

class LifeCycleAdapter extends FragmentPagerAdapter {

    private final List<LifeCycleFragment> mItems = new ArrayList<>();

    LifeCycleAdapter(FragmentManager fm, List<LifeCycleFragment> list) {
        super(fm);
        mItems.addAll(list);
    }

    @Override
    public Fragment getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public int getCount() {
        return mItems.size();
    }
}
