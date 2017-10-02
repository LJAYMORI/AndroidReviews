package com.jonguk.androidreviews.kotlin.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jonguk.androidreviews.R
import com.jonguk.androidreviews.utils.BaseFragment
import kotlinx.android.synthetic.main.fragment_life_cycle.*

/**
 * Created by Jonguk on 2017. 10. 2..
 */
class LifeCycleFragmentKt: BaseFragment() {

    companion object {
        @JvmStatic private val TAG = "lc-fragment-kt"
        @JvmStatic private val EXTRA_TEXT = "text"
        @JvmStatic fun newInstance(text: String): LifeCycleFragmentKt {
            val fragment = LifeCycleFragmentKt()
            val args = Bundle()
            args.putString(EXTRA_TEXT, text)
            fragment.arguments = args
            return fragment
        }
    }

    private var mText: String? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        val args = arguments
        if (args != null) {
            mText = args.getString(EXTRA_TEXT, "Hello world")
        }
        Log.d(TAG, "onAttach() called - $mText")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate() called - $mText")
    }

    override fun onCreateView(
            inflater: LayoutInflater?,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        Log.d(TAG, "onCreateView() called - $mText")
        return inflater!!.inflate(R.layout.fragment_life_cycle, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated() called - $mText")
        life_cycle_text.text = mText
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called - $mText")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called - $mText")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called - $mText")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called - $mText")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called - $mText")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView() called - $mText")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach() called - $mText")
    }

}