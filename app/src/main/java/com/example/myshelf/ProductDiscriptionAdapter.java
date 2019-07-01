package com.example.myshelf;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ProductDiscriptionAdapter extends FragmentPagerAdapter {

    public ProductDiscriptionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        ProductDescriptionFragment productDescriptionFragment = new ProductDescriptionFragment();
        return productDescriptionFragment;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
