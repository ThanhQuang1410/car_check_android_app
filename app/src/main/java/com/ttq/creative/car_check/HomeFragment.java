package com.ttq.creative.car_check;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    GridView gridView;
    String[] name = {
        "toyota","mescerdes","cadilac","chevrolet","astomartin","audi","bmw","ferrari",
    };
    int[] logo = {
        R.drawable.brand_toyota,
            R.drawable.brand_mescerdes,
            R.drawable.brand_cadilac,
            R.drawable.brand_chevrolet,
            R.drawable.brand_astonmartin,
            R.drawable.brand_audi,
            R.drawable.brand_bmw,
            R.drawable.brand_ferrari,
    };
    public HomeFragment() {
        // Required empty public constructor

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        gridView = (GridView) view.findViewById(R.id.brand_list);
        gridView.setColumnWidth(GridView.AUTO_FIT);
        gridViewAdapter gridViewAdapter = new gridViewAdapter(getContext(), name, logo);
        gridView.setAdapter(gridViewAdapter);
        return view;

    }

}
