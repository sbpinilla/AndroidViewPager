package com.sergio.androidviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sergio on 15/02/18.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);

    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {

        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new UnoFragment();
                break;
            case 1:
                fragment = new DosFragment();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
