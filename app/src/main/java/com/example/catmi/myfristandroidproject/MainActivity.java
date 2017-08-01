package com.example.catmi.myfristandroidproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_chart:
                    mTextMessage.setText(R.string.title_chart);
                    return true;
                case R.id.navigation_member:
                    mTextMessage.setText(R.string.title_member);
                    return true;
                case R.id.navigation_community:
                    mTextMessage.setText(R.string.title_community);
                    return true;
                case R.id.navigation_setting:
                    mTextMessage.setText(R.string.title_setting);
                    return true;
                case R.id.navigation_voice:
                    mTextMessage.setText(R.string.title_voice);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
