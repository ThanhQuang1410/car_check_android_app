package com.ttq.creative.car_check;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int NumberOfTabs){
        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                review_detail_tabOverview tab1 = new review_detail_tabOverview();
                return tab1;
            case 1:
                review_detail_tabDriving tab2 = new review_detail_tabDriving();
                return  tab2;
            case 2:
                review_detail_tabInside tab3 = new review_detail_tabInside();
                return  tab3;
            case 3:
                review_detail_tabOwning tab4 = new review_detail_tabOwning();
                return  tab4;
            case 4:
                review_detail_tabVerdit tab5 = new review_detail_tabVerdit();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
