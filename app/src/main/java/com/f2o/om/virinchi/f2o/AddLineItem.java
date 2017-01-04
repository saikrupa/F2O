package com.f2o.om.virinchi.f2o;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Virinchi on 11/25/2016.
 */
public class AddLineItem extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addlineitem);
    }
    public  void ivBack(View v){
        finish();
    }

}
