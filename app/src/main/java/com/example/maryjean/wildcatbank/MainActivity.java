package com.example.maryjean.wildcatbank;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.net.URI;
import java.util.ResourceBundle;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener  {

    /**
     * The {@link PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link FragmentStatePagerAdapter}.
     */

    /**
     * The {@link ViewPager} that will host the section contents.
     */

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    public void onFragmentInteraction(Uri uri){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout =
                (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.account_icon));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.transfers_icon));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.deposits_icon));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.payment_icon));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.spending_icon));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.location_icon));

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new TabPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }



    public void launchDialog(View view){
        android.app.FragmentManager fm = getFragmentManager();
        contact_us dialog = new contact_us();
        dialog.show(fm, "fragment_contact_us");

        //tabLayout.setupWithViewPager(mViewPager);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);

        if (id == R.id.nav_accounts) {
            viewPager.setCurrentItem(0);
        } else if (id == R.id.nav_transfers) {
            viewPager.setCurrentItem(1);
        }
        if (id == R.id.nav_deposits) {
            viewPager.setCurrentItem(2);
        } else if (id == R.id.nav_payments) {
            viewPager.setCurrentItem(3);
        }
        if (id == R.id.nav_spending_habits) {
            viewPager.setCurrentItem(4);
        } else if (id == R.id.nav_location) {
            viewPager.setCurrentItem(5);
        }
        if (id == R.id.nav_setting) {
            viewPager.setCurrentItem(6);
        } else if (id == R.id.nav_exit) {
            if(android.os.Build.VERSION.SDK_INT >= 21)
            {
                finishAndRemoveTask();
            }
            else
            {
                finish();
            }
        }
        // Add more else if statements here for additional menu items

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}


