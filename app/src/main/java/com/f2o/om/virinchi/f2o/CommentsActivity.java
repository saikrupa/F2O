package com.f2o.om.virinchi.f2o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by SaiKrupa on 11/25/2016.
 */

public class CommentsActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

    }
    public void ivBack(View view){
        finish();
    }

    public void btnAddNewComment(View v)
    {
        Intent i=new Intent(getApplicationContext(),AddNewCommentActivity.class);
        startActivity(i);
    }
}
