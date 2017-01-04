package com.f2o.om.virinchi.f2o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ndroid on 12/20/2016.
 */

public class UpdatesActivity extends Activity {

    Button btnNewUpdate;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updates_list);
        intialise();
    }

    public void ivBack(View v) {
        finish();
    }

    public void intialise() {
        btnNewUpdate = (Button) findViewById(R.id.btnNewUpdate);
        btnNewUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UpdatesActivity.this, NewUpdateActivity.class);
                startActivity(i);
            }
        });
    }
}
