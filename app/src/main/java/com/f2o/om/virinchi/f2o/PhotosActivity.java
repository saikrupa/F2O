package com.f2o.om.virinchi.f2o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Virinchi on 11/25/2016.
 */
public class PhotosActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);
    }
    public  void ivBack(View v){
        finish();
    }
    public void btnAddPhoto(View v){
        Intent i = new Intent(getApplicationContext() , AddPhotoActivity.class);
        startActivity(i);
    }
}
