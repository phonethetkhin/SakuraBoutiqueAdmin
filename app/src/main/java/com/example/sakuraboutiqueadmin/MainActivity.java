package com.example.sakuraboutiqueadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.sakuraboutiqueadmin.Adapter.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
TabLayout tlMain;
ViewPager vpMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tlMain=findViewById(R.id.tlMain);
        vpMain=findViewById(R.id.vpMain);
vpMain.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
vpMain.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tlMain));
getSupportActionBar().setTitle("Add Shoes");
tlMain.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
vpMain.setCurrentItem(tab.getPosition());
String title="";
switch (tab.getPosition())
{
    case 0:
        title="Add Shoes";
        break;
    case 1:
        title="Add Bags";
        break;
    case 2:
        title="Add Tops";
        break;
    case 3:
        title="Add Bottoms";
        break;
    case 4:
        title="Add Men's Wear";
}
getSupportActionBar().setTitle(title);
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
});
    }
}
