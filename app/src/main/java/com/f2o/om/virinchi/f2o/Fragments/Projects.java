package com.f2o.om.virinchi.f2o.Fragments;

/**
 * Created by SaiKrupa on 11/16/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.f2o.om.virinchi.f2o.InfoActivity;
import com.f2o.om.virinchi.f2o.InspectionsActivity;
import com.f2o.om.virinchi.f2o.PhotosActivity;
import com.f2o.om.virinchi.f2o.R;
import com.f2o.om.virinchi.f2o.NewUpdateActivity;
import com.f2o.om.virinchi.f2o.UpdatesActivity;


public class Projects extends Fragment implements View.OnClickListener {
    View rootView;
    Button s1info , s2info , s1updates , s2updates , s1photos , s2photos, s1inspections,s2inspections;

    public Projects() {
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
        rootView = inflater.inflate(R.layout.fragment_projects, container, false);
        intilize();
        return rootView;
    }

    private void intilize() {
        s1info = (Button) rootView.findViewById(R.id.s1info);
        s1info.setOnClickListener(this);
        s2info = (Button) rootView.findViewById(R.id.s2info);
        s2info.setOnClickListener(this);
        s1updates = (Button) rootView.findViewById(R.id.s1updates);
        s1updates.setOnClickListener(this);
        s2updates = (Button) rootView.findViewById(R.id.s2updates);
        s2updates.setOnClickListener(this);
        s1photos = (Button) rootView.findViewById(R.id.s1photos);
        s1photos.setOnClickListener(this);
        s2photos = (Button) rootView.findViewById(R.id.s2photos);
        s2photos.setOnClickListener(this);

        s1inspections=(Button)rootView.findViewById(R.id.s1inspections);
        s1inspections.setOnClickListener(this);
        s2inspections=(Button)rootView.findViewById(R.id.s2inspections);
        s2inspections.setOnClickListener(this);



    }

    public void onClick(View v) {
        if(v.getId() == R.id.s1info) {
            Intent i = new Intent(getActivity(), InfoActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.s2info){
            Intent i = new Intent(getActivity(), InfoActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.s1updates){
            Intent i = new Intent(getActivity(), UpdatesActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.s2updates){
            Intent i = new Intent(getActivity(), UpdatesActivity.class);
            startActivity(i);
        } else if(v.getId() == R.id.s1photos){
            Intent i = new Intent(getActivity(), PhotosActivity.class);
            startActivity(i);
        }
        else if(v.getId() == R.id.s2photos){
            Intent i = new Intent(getActivity(), PhotosActivity.class);
            startActivity(i);
        }

        else if(v.getId() == R.id.s1inspections)
        {
            Intent i=new Intent(getActivity(), InspectionsActivity.class);
            startActivity(i);
        }else if(v.getId() == R.id.s2inspections)
        {
            Intent i=new Intent(getActivity(), InspectionsActivity.class);
            startActivity(i);
        }
    }

}

