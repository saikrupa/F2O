package com.f2o.om.virinchi.f2o;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Virinchi on 11/25/2016.
 */
public class NewUpdateActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updates);

    }
    public  void ivBack(View v){
        finish();
    }

    public void ivPhotos(View v){
        Intent i = new Intent (getApplicationContext() , PhotosActivity.class);
        startActivity(i);
    }
public void txtViewdetails(View v){
    dialogue();
}
    public void dialogue () {
        AlertDialog.Builder builder = new AlertDialog.Builder(NewUpdateActivity.this);

        // get the layout inflater
        LayoutInflater inflater = NewUpdateActivity.this.getLayoutInflater();

        // inflate and set the layout for the dialog
        // pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.viewdetails, null))

                // action buttons

                .show();
    }

}
