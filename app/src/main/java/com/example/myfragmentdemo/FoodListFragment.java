package com.example.myfragmentdemo;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodListFragment extends ListFragment {

    static interface foodListListener
    {
        void itemClicked(long id);
    }
    private foodListListener listener;

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        this.listener= (foodListListener) activity;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if(listener!=null) {
            listener.itemClicked(id);
        }
    }
    public FoodListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
String names [] = new String[Menu.menus.length];
for(int i=0; i<names.length; i++)
{
    names[i]= Menu.menus[i].getName();
}
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, names);
setListAdapter(adapter);
return super.onCreateView(inflater, container, savedInstanceState);

    }
}
