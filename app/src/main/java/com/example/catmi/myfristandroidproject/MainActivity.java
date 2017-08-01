package com.example.catmi.myfristandroidproject;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import fragment.fragment_chart;
import fragment.fragment_community;
import fragment.fragment_member;
import fragment.fragment_setting;
import fragment.fragment_voice;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_chart:
                   // mTextMessage.setText(R.string.title_chart);
                    setFragment(new fragment_chart());
                    return true;
                case R.id.navigation_member:
                    //mTextMessage.setText(R.string.title_member);
                    setFragment(new fragment_member());
                    return true;
                case R.id.navigation_community:
                    //mTextMessage.setText(R.string.title_community);
                    setFragment(new fragment_community());
                    return true;
                case R.id.navigation_setting:
                    //mTextMessage.setText(R.string.title_setting);
                    setFragment(new fragment_setting());
                    return true;
                case R.id.navigation_voice:
                    //mTextMessage.setText(R.string.title_voice);
                    setFragment(new fragment_voice());
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        setFragment(new fragment_chart());
    }

    protected void setFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.id_content,fragment);
        fragmentTransaction.commit();
    }

}
