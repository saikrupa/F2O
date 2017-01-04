package com.f2o.om.virinchi.f2o;

import android.app.Activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.f2o.om.virinchi.f2o.R;

/**
 * Created by Virinchi on 11/24/2016.
 */
public class InfoActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }
    public  void ivBack(View v){
        finish();
    }
}