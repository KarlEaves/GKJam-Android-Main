package com.karl.gux.gkjam.Activities;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.karl.gux.gkjam.Activities.Fragments.NoteListenerFragment;
import com.karl.gux.gkjam.Activities.Fragments.LearnScalesFragment;
import com.karl.gux.gkjam.Activities.Fragments.ScaleFinderFragment;
import com.karl.gux.gkjam.R;


public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);


//      ==============================  Bottom Tabs ================
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.action_item1:
                                selectedFragment = NoteListenerFragment.newInstance();
                                break;
                            case R.id.action_item2:
                                selectedFragment = ScaleFinderFragment.newInstance();
                                break;
                            case R.id.action_item3:
                                selectedFragment = LearnScalesFragment.newInstance();
                                break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });

        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, NoteListenerFragment.newInstance());
        transaction.commit();
    }




}

