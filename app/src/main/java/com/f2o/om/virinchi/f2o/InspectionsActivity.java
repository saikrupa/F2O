package com.f2o.om.virinchi.f2o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by SaiKrupa on 11/25/2016.
 */

public class InspectionsActivity extends Activity {

    Button btnNewInspection;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_inspection);
        intialise();
    }

    public void ivBack(View v) {
        finish();
    }

    public void intialise() {
        btnNewInspection = (Button) findViewById(R.id.btnNewInspection);
        btnNewInspection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InspectionsActivity.this, AddNewInspectionActivity.class);
                startActivity(i);
            }
        });
    }


}
