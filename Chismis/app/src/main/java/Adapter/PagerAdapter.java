package Adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import Fragment_Class.FragmentFive;
import Fragment_Class.FragmentFour;
import Fragment_Class.FragmentOne;
import Fragment_Class.FragmentThree;
import Fragment_Class.FragmentTwo;

/**
 * Created by theresa on 27/3/15.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 5;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Bundle data = new Bundle();
        switch (i){
            case  0:
                FragmentOne fragment1 = new FragmentOne();
                return fragment1;
            case 1:
                FragmentTwo fragment2 = new FragmentTwo();
                return fragment2;
            case 2:
                FragmentFive fragment5 = new FragmentFive();
                return fragment5;
            case 3:
                FragmentThree fragment3 = new FragmentThree();
                return fragment3;
            case 4:
                FragmentFour fragment4 = new FragmentFour();
                return fragment4;
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
