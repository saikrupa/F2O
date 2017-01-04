package com.f2o.om.virinchi.f2o;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Virinchi on 12/1/2016.
 */
public class AddTaskActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
    }
    public  void ivBack(View v){
        finish();
    }
}
