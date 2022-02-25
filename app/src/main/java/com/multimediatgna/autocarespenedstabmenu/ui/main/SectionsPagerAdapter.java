package com.multimediatgna.autocarespenedstabmenu.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.multimediatgna.autocarespenedstabmenu.R;

import com.multimediatgna.autocarespenedstabmenu.tab1;
import com.multimediatgna.autocarespenedstabmenu.tab2;
import com.multimediatgna.autocarespenedstabmenu.tab3;
import com.multimediatgna.autocarespenedstabmenu.tab4;


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment myfragment = null;
        switch (position) {

            case 0:
                myfragment = tab1.newInstance("","");
                break;
            case 1:
                myfragment = tab2.newInstance("","");
                break;
            case 2:
                myfragment = tab3.newInstance("","");
                break;
            case 3:
                myfragment = tab4.newInstance("","");
                break;
        }
        return myfragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}