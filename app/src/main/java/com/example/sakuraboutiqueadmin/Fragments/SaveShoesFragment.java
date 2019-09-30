package com.example.sakuraboutiqueadmin.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.example.sakuraboutiqueadmin.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class SaveShoesFragment extends Fragment {
TextInputEditText tietID,tietName,tietBrand,tietPrice,tietDescription,tietFreesize;
Switch FixorFree;
CheckBox cbSmall,cbMedium,cbLarge,cbExtraLarge;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_save_shoes, container, false);
        tietID=v.findViewById(R.id.tietID);
        tietName=v.findViewById(R.id.tietName);
        tietBrand=v.findViewById(R.id.tietBrand);
        tietPrice=v.findViewById(R.id.tietPrice);
        tietDescription=v.findViewById(R.id.tietDescription);
        tietFreesize=v.findViewById(R.id.tietFreeSize);
        FixorFree=v.findViewById(R.id.FixorFree);
        cbSmall=v.findViewById(R.id.cbSmall);
        cbMedium=v.findViewById(R.id.cbMedium);
        cbLarge=v.findViewById(R.id.cbLarge);
        cbExtraLarge=v.findViewById(R.id.cbExtraLarge);
        //finish initiate views;

        //starting check switch
        FixorFree.setChecked(false);
        cbSmall.setVisibility(View.GONE);
        cbMedium.setVisibility(View.GONE);
        cbLarge.setVisibility(View.GONE);
        cbExtraLarge.setVisibility(View.GONE);
        FixorFree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(FixorFree.isChecked())
                {
                    tietFreesize.setVisibility(View.GONE);
                    cbSmall.setVisibility(View.VISIBLE);
                    cbMedium.setVisibility(View.VISIBLE);
                    cbLarge.setVisibility(View.VISIBLE);
                    cbExtraLarge.setVisibility(View.VISIBLE);
                }
                else
                {
                    tietFreesize.setVisibility(View.VISIBLE);
                    cbSmall.setVisibility(View.GONE);
                    cbMedium.setVisibility(View.GONE);
                    cbLarge.setVisibility(View.GONE);
                    cbExtraLarge.setVisibility(View.GONE);
                }

            }
        });















        return v;
    }

}
