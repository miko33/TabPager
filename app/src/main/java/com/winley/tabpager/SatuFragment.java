package com.winley.tabpager;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SatuFragment extends Fragment {

    TabLayout tab;
    ViewPager pager;



    public SatuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank_satu, container, false);

        tab = v.findViewById(R.id.tabssatu);
        pager = v.findViewById(R.id.pagger);

        TabAdapter adapter = new TabAdapter(getFragmentManager());
        pager.setAdapter(adapter);
        tab.setupWithViewPager(pager);

        return v;
    }

    class TabAdapter extends FragmentPagerAdapter{


        public TabAdapter(FragmentManager fm) { super(fm); }

        @Override
        public Fragment getItem(int i) {
            Fragment fragment = null;
            if(i == 0){
                fragment = new sasatufragment();
            }
            else  {
                fragment = new sadua();
            }


            return fragment;
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0){
                return "satu";
            }
            else  {
                return "dua"; }
        }
    }
}
