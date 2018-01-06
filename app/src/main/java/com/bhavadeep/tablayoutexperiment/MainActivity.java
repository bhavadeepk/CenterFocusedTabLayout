package com.bhavadeep.tablayoutexperiment;

import android.os.Build;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CenterFocusTabLayout tabLayout = findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Tab......1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab....3"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab..........4"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 5"));
        tabLayout.addTab(tabLayout.newTab().setText("6"));
        tabLayout.addTab(tabLayout.newTab().setText("7"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab.......8"));

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            tabLayout.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

                }
            });
        }

       // ((HorizontalScrollView)tabLayout).onScroll
    }
}
