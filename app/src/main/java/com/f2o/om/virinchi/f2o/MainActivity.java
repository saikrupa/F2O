package com.f2o.om.virinchi.f2o;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.f2o.om.virinchi.f2o.Fragments.Bids;
import com.f2o.om.virinchi.f2o.Fragments.Projects;
import com.f2o.om.virinchi.f2o.Fragments.History;
import com.f2o.om.virinchi.f2o.Fragments.Profile;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.mipmap.dashboard,
            R.mipmap.bids,
            R.mipmap.jobs,
            R.mipmap.profile
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

        tabLayout.getTabAt(0).getCustomView().setAlpha(1.0f);
        tabLayout.getTabAt(1).getCustomView().setAlpha(0.6f);
        tabLayout.getTabAt(2).getCustomView().setAlpha(0.6f);
        tabLayout.getTabAt(3).getCustomView().setAlpha(0.6f);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        tabLayout.getTabAt(0).getCustomView().setAlpha(1.0f);
                        tabLayout.getTabAt(1).getCustomView().setAlpha(0.6f);
                        tabLayout.getTabAt(2).getCustomView().setAlpha(0.6f);
                        tabLayout.getTabAt(3).getCustomView().setAlpha(0.6f);
                        break;
                    case 1:
                        tabLayout.getTabAt(0).getCustomView().setAlpha(0.6f);
                        tabLayout.getTabAt(1).getCustomView().setAlpha(1.0f);
                        tabLayout.getTabAt(2).getCustomView().setAlpha(0.6f);
                        tabLayout.getTabAt(3).getCustomView().setAlpha(0.6f);
                        break;
                    case 2:
                        tabLayout.getTabAt(0).getCustomView().setAlpha(0.6f);
                        tabLayout.getTabAt(1).getCustomView().setAlpha(0.6f);
                        tabLayout.getTabAt(2).getCustomView().setAlpha(1.0f);
                        tabLayout.getTabAt(3).getCustomView().setAlpha(0.6f);
                        break;
                    case 3:
                        tabLayout.getTabAt(0).getCustomView().setAlpha(0.6f);
                        tabLayout.getTabAt(1).getCustomView().setAlpha(0.6f);
                        tabLayout.getTabAt(2).getCustomView().setAlpha(0.6f);
                        tabLayout.getTabAt(3).getCustomView().setAlpha(1.0f);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });


    }

    private void setupTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText("Projects");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.dashboard, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabTwo.setText("Bids");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.bids, 0, 0);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabThree.setText("History");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.jobs, 0, 0);
        tabLayout.getTabAt(2).setCustomView(tabThree);
        TextView tabFour = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabFour.setText("Profile");
        tabFour.setCompoundDrawablesWithIntrinsicBounds(0, R.mipmap.profile, 0, 0);
        tabLayout.getTabAt(3).setCustomView(tabFour);
    }




    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFrag(new Projects(), "ONE");
        adapter.addFrag(new Bids(), "TWO");
        adapter.addFrag(new History(), "THREE");
        adapter.addFrag(new Profile(), "FOUR");
        viewPager.setAdapter(adapter);
    }

        public  class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }


        @Override
        public Fragment getItem(int position) {

            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }


        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {

            return mFragmentTitleList.get(position);
        }


    }


}

