package com.f2o.om.virinchi.f2o;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Virinchi on 12/2/2016.
 */
public class AddPhotoActivity extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_photo);
    }
    public  void ivBack(View v){
        finish();
    }
    public  void btnUpdate(View v){
        finish();
    }
    public  void btnCancel(View v){
        finish();
    }
}
