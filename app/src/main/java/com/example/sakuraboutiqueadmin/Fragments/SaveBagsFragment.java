package com.example.sakuraboutiqueadmin.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sakuraboutiqueadmin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SaveBagsFragment extends Fragment {


    public SaveBagsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_save_bags, container, false);
    }

}
