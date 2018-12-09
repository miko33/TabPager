package com.winley.tabpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab = findViewById(R.id.tabs);
        pager = findViewById(R.id.pager);

        TabAdapter adapter = new TabAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        tab.setupWithViewPager(pager);

    }

    //cara membuat tab lebih dari satu
    class TabAdapter extends FragmentPagerAdapter{

        TabAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            Fragment fragment = null;
            if(i == 0){
                 fragment = new SatuFragment();
            }
            else if (i == 1) {
                fragment = new DuaFragment();
            }
            else if (i == 2) {
                fragment = new TigaFragment();
            }
            else{
                fragment = new EmpatFragment();
            }

            return fragment;
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0){
                return "satu";
            }
            else if (position == 1) {
                return "dua";
            }
            else if (position == 2) {
                return "tiga";
            }
            else {
                return "empat";
            }
        }
    }
}
