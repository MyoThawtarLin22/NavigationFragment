package com.example.navigationfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class GalleryFragment extends Fragment {
    private List<Model> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MovieAdapter mAdapter;


    public GalleryFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }
public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
    super.onViewCreated(view, savedInstanceState);
    mAdapter = new MovieAdapter(movieList);
    recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
    RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
    recyclerView.setLayoutManager(mLayoutManager);
    recyclerView.setItemAnimator(new DefaultItemAnimator());
    recyclerView.setAdapter(mAdapter);

    prepareMovieData();
}
    private void prepareMovieData() {
        Model movie = new Model("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);

        movie = new Model("Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);

        movie = new Model("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);

        movie = new Model("Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);

        movie = new Model("The Martian", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);

        movie = new Model("Mission: Impossible Rogue Nation", "Action", "2015");
        movieList.add(movie);

        movie = new Model("Up", "Animation", "2009");
        movieList.add(movie);

        movie = new Model("Star Trek", "Science Fiction", "2009");
        movieList.add(movie);

        movie = new Model("The LEGO Movie", "Animation", "2014");
        movieList.add(movie);

        movie = new Model("Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);

        movie = new Model("Aliens", "Science Fiction", "1986");
        movieList.add(movie);

        movie = new Model("Chicken Run", "Animation", "2000");
        movieList.add(movie);

        movie = new Model("Back to the Future", "Science Fiction", "1985");
        movieList.add(movie);

        movie = new Model("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieList.add(movie);

        movie = new Model("Goldfinger", "Action & Adventure", "1965");
        movieList.add(movie);

        movie = new Model("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);

        mAdapter.notifyDataSetChanged();
    }
}



