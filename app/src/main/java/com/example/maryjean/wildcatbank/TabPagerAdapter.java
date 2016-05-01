package com.example.maryjean.wildcatbank;

/**
 * Created by Maryjean on 5/1/2016.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Maryjean on 4/28/2016.
 */
public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabcount;

    public TabPagerAdapter(FragmentManager fm, int numberOfTabs){
        super(fm);
        this.tabcount = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

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
            default:
                return null;
        }
    }


    @Override
    public int getCount(){
        return tabcount;
    }

}
