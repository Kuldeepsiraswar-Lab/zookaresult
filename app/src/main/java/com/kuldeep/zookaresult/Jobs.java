package com.kuldeep.zookaresult;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kuldeep.zookaresult.Child_Tab_Jobs.All_Jobs;
import com.kuldeep.zookaresult.Child_Tab_Jobs.BANK;
import com.kuldeep.zookaresult.Child_Tab_Jobs.ENGINEERING;
import com.kuldeep.zookaresult.Child_Tab_Jobs.POLICEANDDEFENCE;
import com.kuldeep.zookaresult.Child_Tab_Jobs.RAILWAY;
import com.kuldeep.zookaresult.Child_Tab_Jobs.SSC;
import com.kuldeep.zookaresult.Child_Tab_Jobs.TEACHING;

public class Jobs extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.nestedtab, container, false);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.container_main);
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);

        return view;

    }


    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return All_Jobs.newInstance(1);
                case 1:
                    return SSC.newInstance(4);
                case 2:
                    return BANK.newInstance(2);
                case 3:
                    return RAILWAY.newInstance(3);
                case 4:
                    return TEACHING.newInstance(5);
                case 5:
                    return POLICEANDDEFENCE.newInstance(6);
                case 6:
                    return ENGINEERING.newInstance(7);
                default:
                    return All_Jobs.newInstance(8);
            }

        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 7;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "ALL JOBS";
                case 1:
                    return "SSC";
                case 2:
                    return "BANK";
                case 3:
                    return "RAILWAY";
                case 4:
                    return "TEACHING";
                case 5:
                    return "POLICE & DEFENCE";
                case 6:
                    return "ENGINEERING";
            }

            return null;
        }
    }

}