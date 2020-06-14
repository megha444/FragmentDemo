package com.example.myfragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FoodListFragment.foodListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void itemClicked(long id) {
MenuDetailFragment details = new MenuDetailFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        details.setMenuID(id);

        ft.replace(R.id.frag_container, details);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }
}
