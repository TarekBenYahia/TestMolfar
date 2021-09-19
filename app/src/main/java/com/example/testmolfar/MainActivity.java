package com.example.testmolfar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setContentView(R.layout.activity_main);
        try {
            this.getSupportActionBar().hide();

        } catch (NullPointerException e) {
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Music()).commit();

        BottomNavigationView bottomNavigationView= findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFrag = null;
                    switch (menuItem.getItemId()){
                        case R.id.nav_music:
                            selectedFrag = new Music();
                            break;
                        case R.id.nav_favourites:
                            selectedFrag = new Favourites();
                            break;
                        case R.id.nav_journal:
                            selectedFrag = new Journal();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace (R.id.fragment_container, selectedFrag).commit();
                    return true;
                }
            };


}