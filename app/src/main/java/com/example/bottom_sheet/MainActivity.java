package com.example.bottom_sheet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView buttonView = findViewById(R.id.Bottom_nav);
        buttonView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment= null;
                switch (item.getItemId()){
                    case R.id.nav_homme:
                        selectedFragment= new HomeFragment();
                        break;
                    case R.id.nav_favouritr:
                        selectedFragment= new FavouriteFragment();
                        break;
                    case R.id.nav_search:
                        selectedFragment= new SearchFragment();
                        break;
                    case R.id.nav_contact:
                        selectedFragment= new contactus();
                        break;
                    case R.id.nav_aboutus:
                        selectedFragment= new aboutus();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container,
                        selectedFragment).commit();
                return true;
            }
        });
       // buttonView.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) navListener);

getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container,
        new HomeFragment()).commit();
    }
    /*private NavigationBarView.OnItemReselectedListener navListener =
            new NavigationBarView.OnItemReselectedListener() {
                @Override
                public void onNavigationItemReselected(@NonNull MenuItem item) {
                    Fragment selectedFragment= null;
                    switch (item.getItemId()){
                        case R.id.nav_homme:
                            selectedFragment= new HomeFragment();
                            break;
                        case R.id.nav_favouritr:
                            selectedFragment= new FavouriteFragment();
                            break;
                        case R.id.nav_search:
                            selectedFragment= new SearchFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_container,
                            selectedFragment).commit();

                }
            };*/
}