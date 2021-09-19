package com.example.testmolfar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testmolfar.Adapters.MusicAdapter;
import com.example.testmolfar.Models.MusicModel;

import java.util.ArrayList;
import java.util.List;

public class Music extends Fragment {

    //var defining
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager manager;
    private List<MusicModel> myDataSet = new ArrayList<MusicModel>();



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.activity_music,container,false);
        //var affectation
        recyclerView = view.findViewById(R.id.recycler_view_musiclist);
        manager = new GridLayoutManager(getActivity(),1);
        recyclerView.setLayoutManager(manager);
        Context mContext = getActivity().getApplicationContext();
        myDataSet = new ArrayList<>();
        myDataSet.add(new MusicModel("Female Super Model \nBooster track","Become physically attractive",R.drawable.images));
        myDataSet.add(new MusicModel("Greek God Physique \nBooster v3.1","Fitness & welness",R.drawable.poseidon_2));
        myDataSet.add(new MusicModel("The most amazing \nmusic track for you","Design your future",R.drawable.unnamed));
        myDataSet.add(new MusicModel("Strongest Audio Booster \nTrack v3.1","Gest faster results",R.drawable.hero));

        mAdapter = new MusicAdapter(mContext,myDataSet);
        recyclerView.setAdapter(mAdapter);


        return view;
    }
}