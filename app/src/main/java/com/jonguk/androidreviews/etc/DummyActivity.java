package com.jonguk.androidreviews.etc;

import android.content.Context;
import android.content.Intent;

import com.jonguk.androidreviews.R;
import com.jonguk.androidreviews.utils.BaseActivity;

/**
 * Created by Jonguk on 2017. 10. 12..
 */

public class DummyActivity extends BaseActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, DummyActivity.class);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_dummy;
    }

}
