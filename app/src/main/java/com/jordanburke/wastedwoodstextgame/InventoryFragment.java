package com.jordanburke.wastedwoodstextgame;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;


public class InventoryFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inventory, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    public static InventoryFragment newInstance() {

        Bundle args = new Bundle();

        InventoryFragment fragment = new InventoryFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
