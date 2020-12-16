package com.kuldeep.zookaresult;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kuldeep.zookaresult.Notification_Child.EXAMWISE;
import com.kuldeep.zookaresult.Notification_Child.Latest;
import com.kuldeep.zookaresult.Notification_Child.NOTIFICATION_STATUS;
import com.kuldeep.zookaresult.Notification_Child.Upcoming;

public class Notification extends Fragment  {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.nestedtab, container, false);
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.container_main);
        Notification.SectionsPagerAdapter mSectionsPagerAdapter = new Notification.SectionsPagerAdapter(getChildFragmentManager());
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
                    return Latest.newInstance(1);
                case 1:
                    return Upcoming.newInstance(2);
                case 2:
                    return EXAMWISE.newInstance(3);
                case 3:
                    return NOTIFICATION_STATUS.newInstance(4);
                default:
                    return Latest.newInstance(1);
            }

        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "Latest";
                case 1:
                    return "upcoming";
                case 2:
                    return "EXAMWISE";
                case 3:
                    return "STATUS";
            }

            return null;
        }
    }
}