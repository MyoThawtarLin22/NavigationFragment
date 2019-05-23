package com.example.navigationfragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.NavController;


public class SlideshowFragment extends Fragment {
Button button;
    public NavigationView navigationView;
    public NavController navController;

    public SlideshowFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_slideshow, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
     button=view.findViewById(R.id.btnOne);

    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnOne:
                navigationView.setCheckedItem(R.id.btnOne);
                navController.navigate(R.id.newfragment);
               break;
        }
    }
}
