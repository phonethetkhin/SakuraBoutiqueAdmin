package com.example.sakuraboutiqueadmin.Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.sakuraboutiqueadmin.Fragments.SaveBagsFragment;
import com.example.sakuraboutiqueadmin.Fragments.SaveBottomsFragment;
import com.example.sakuraboutiqueadmin.Fragments.SaveMenWearsFragment;
import com.example.sakuraboutiqueadmin.Fragments.SaveShoesFragment;
import com.example.sakuraboutiqueadmin.Fragments.SaveTopsFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment=new SaveShoesFragment();
                break;
            case 1:
                fragment=new SaveBagsFragment();
                break;
            case 2:
                fragment=new SaveTopsFragment();
                break;
            case 3:
                fragment=new SaveBottomsFragment();
                break;
            case 4:
                fragment=new SaveMenWearsFragment();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
