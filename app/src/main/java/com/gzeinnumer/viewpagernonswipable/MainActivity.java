package com.gzeinnumer.viewpagernonswipable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.gzeinnumer.viewpagernonswipable.adapter.ViewPagerAdapter;
import com.gzeinnumer.viewpagernonswipable.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewPager();

    }

    private void initViewPager() {
        final ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPagerAdapter.addFragment(MainFragment.newInstance());

        ViewPager pager = findViewById(R.id.pager);
        pager.setAdapter(viewPagerAdapter);
    }
}