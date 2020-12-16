package com.kuldeep.zookaresult;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(new InternetDialog(this).getInternetStatus());
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Today_Update tab1 = new Today_Update();
                    return tab1;
                case 1:
                    Jobs tab2 = new Jobs();
                    return tab2;
                case 2:
                    Result tab3 = new Result();
                    return tab3;
                case 3:
                    AdmitCard tab4 = new AdmitCard();
                    return tab4;
                case 4:
                    University tab5 = new University();
                    return tab5;
                case 5:
                    Notification tab6 = new Notification();
                    return tab6;
                case 6:
                    Answerkey tab7 = new Answerkey();
                    return tab7;
                case 7:
                    Cutoff tab8 = new Cutoff();
                    return tab8;
                case 8:
                    Admission tab9 = new Admission();
                    return tab9;
                case 9:
                    Schoolarship tab10 = new Schoolarship();
                    return tab10;
                case 10:
                    Certificate tab11 = new Certificate();
                    return tab11;
                case 11:
                    Syllabus tab12 = new Syllabus();
                    return tab12;
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 12;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Today's Update";
                case 1:
                    return "Latest-Jobs";
                case 2:
                    return "Result";
                case 3:
                    return "Admit-Card";
                case 4:
                    return "University-Update";
                case 5:
                    return "Notification";
                case 6:
                    return "Answer-Key";
                case 7:
                    return "Cut-Off";
                case 8:
                    return "Admission";
                case 9:
                    return "Schoolarship";
                case 10:
                    return "Online-Services";
                case 11:
                    return "Syllabus";
            }
            return null;
        }
    }
}