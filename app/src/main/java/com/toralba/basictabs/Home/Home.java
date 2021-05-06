package com.toralba.basictabs.Home;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.toralba.basictabs.Home.Pages.Tab1;
import com.toralba.basictabs.Home.Pages.Tab2;
import com.toralba.basictabs.Home.Pages.Tab3;
import com.toralba.basictabs.R;

public class Home extends AppCompatActivity {

private ViewPagerAdapter viewPagerAdapter;
private ViewPager viewPager;
private TabLayout tabLayout;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        viewPager = findViewById(R.id.viewpager);

        // setting up the adapter
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        // add the fragments
        viewPagerAdapter.add(new Tab1(), "Tab1");
        viewPagerAdapter.add(new Tab2(), "Tab2");
        viewPagerAdapter.add(new Tab3(), "Tab3");

        // Set the adapter
        viewPager.setAdapter(viewPagerAdapter);

        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to  set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        }

}