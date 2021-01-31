package com.android.sistempakar.Solusi;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.android.sistempakar.R;
import com.google.android.material.tabs.TabLayout;


public class Main_Skincare extends AppCompatActivity {
    private static final String TAG = "Main_Skincare";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main__skincare);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "Normal");
        adapter.addFragment(new Tab2Fragment(), "Berminyak");
        adapter.addFragment(new Tab3Fragment(), "Kering");
        adapter.addFragment(new Tab4Fragment(), "Kombinasi");
        adapter.addFragment(new Tab5Fragment(), "Sensitif");
        viewPager.setAdapter(adapter);

    }

}