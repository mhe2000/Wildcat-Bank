package com.example.maryjean.wildcatbank;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Maryjean on 4/18/2016.
 */
public class TabPagerAdapter extends FragmentPagerAdapter {


    private String mContext;
    int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.tabCount = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below)
        switch (position) {
            case 0:
                accounts tab1 = new accounts();
                return tab1;
            case 1:
                transfers tab2 = new transfers();
                return tab2;
            case 2:
                deposits tab3 = new deposits();
                return tab3;
            case 3:
                payments tab4 = new payments();
                return tab4;
            case 4:
                spending tab5 = new spending();
                return tab5;
            case 5:
                location tab6 = new location();
                return tab6;
        }
        return null;
        //return PlaceholderFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        // Show 6 total pages.
        return tabCount;
    }

   /* @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Accounts";
            case 1:
                return "Transfers";
            case 2:
                return "Deposits";
            case 3:
                return "Payments";
            case 4:
                return "Spending";
            case 5:
                return "Location";
        }
        return null;
    }

    public int getIcon(int position) {
        switch (position) {
            case 0:
                return R.drawable.account_icon;
            case 1:
                return R.drawable.transfers_icon;
        }

        return R.drawable.account_icon;
    }*/
}


