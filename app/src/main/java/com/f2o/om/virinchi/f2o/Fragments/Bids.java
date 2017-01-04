package com.f2o.om.virinchi.f2o.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.f2o.om.virinchi.f2o.EstimatesActivity;
import com.f2o.om.virinchi.f2o.InfoActivity;
import com.f2o.om.virinchi.f2o.PhotosActivity;
import com.f2o.om.virinchi.f2o.R;


/**
 * Created by SaiKrupa on 11/16/2016.
 */

public class Bids extends Fragment implements View.OnClickListener {
View rootView;
    Button s1info ,s2info ,  s1photos , s2photos , s1estimates , s2estimates;
    public Bids() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_bids, container, false);
        intilize();
        return rootView ;
    }
    private void intilize() {
        s1info = (Button) rootView.findViewById(R.id.s1info);
        s1info.setOnClickListener(this);
        s2info = (Button) rootView.findViewById(R.id.s2info);
        s2info.setOnClickListener(this);
        s1photos = (Button) rootView.findViewById(R.id.s1photos);
        s1photos.setOnClickListener(this);
        s2photos = (Button) rootView.findViewById(R.id.s2photos);
        s2photos.setOnClickListener(this);
        s1estimates = (Button) rootView.findViewById(R.id.s1estimates);
        s1estimates.setOnClickListener(this);
        s2estimates = (Button) rootView.findViewById(R.id.s2estimates);
        s2estimates.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v.getId() == R.id.s1info) {
            Intent i = new Intent(getActivity(), InfoActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.s2info){
            Intent i = new Intent(getActivity(), InfoActivity.class);
            startActivity(i);
        }else if(v.getId() == R.id.s1photos){
            Intent i = new Intent(getActivity(), PhotosActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.s2photos){
            Intent i = new Intent(getActivity(), PhotosActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.s1estimates){
            Intent i = new Intent(getActivity(), EstimatesActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.s2estimates){
            Intent i = new Intent(getActivity(), EstimatesActivity.class);
            startActivity(i);
        }
    }
}


