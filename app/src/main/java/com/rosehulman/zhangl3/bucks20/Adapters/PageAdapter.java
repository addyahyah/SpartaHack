package com.rosehulman.zhangl3.bucks20.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.rosehulman.zhangl3.bucks20.Fragments.PageFragment;

/**
 * Created by zhangl3 on 2/27/2016.
 */
public class PageAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Feed", "Profile", "Notification" };
    private Context context;

    public PageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return this.tabTitles[position];
    }
}
