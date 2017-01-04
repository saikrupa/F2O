package com.f2o.om.virinchi.f2o;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by SaiKrupa on 11/25/2016.
 */

public class AddNewCommentActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_comment);

    }
    public void ivBack(View view){
        finish();
    }
}
