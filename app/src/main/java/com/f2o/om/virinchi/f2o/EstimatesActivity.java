package com.f2o.om.virinchi.f2o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Virinchi on 11/25/2016.
 */
public class EstimatesActivity extends Activity {
   /* protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estimate_tab);
    }
    public  void ivBack(View v){
        finish();
    }
    public void btnAddlineitem(View v){
        Intent i = new Intent(getApplicationContext() , AddLineItem.class);
        startActivity(i);
    }*/



    Button btnGeneral, btnCondition, btnLineitems;
    LinearLayout liGeneralitems, liConditionitems, liLineitems;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_estimate_tab);
        intilize();
    }

    public void intilize() {
        btnGeneral = (Button) findViewById(R.id.btnGeneral);
        btnCondition = (Button) findViewById(R.id.btnCondition);
        btnLineitems = (Button) findViewById(R.id.btnLineitems);
        liGeneralitems = (LinearLayout) findViewById(R.id.liGeneralitems);
        liConditionitems = (LinearLayout) findViewById(R.id.liConditionitems);
        liLineitems = (LinearLayout) findViewById(R.id.liLineitems);


        liGeneralitems.setVisibility(View.VISIBLE);
        btnGeneral.setBackgroundColor(getResources().getColor(R.color.BackGround));
        liConditionitems.setVisibility(View.GONE);
        btnCondition.setBackgroundColor(getResources().getColor(R.color.white));
        liLineitems.setVisibility(View.GONE);
        btnLineitems.setBackgroundColor(getResources().getColor(R.color.white));

    }

    public void ivBack(View v) {
        finish();
    }
public void btnAddTask(View v){
    Intent i = new Intent(getApplicationContext() , AddTaskActivity.class);
startActivity(i);}
    public void btnGeneral(View v) {
        liGeneralitems.setVisibility(View.VISIBLE);
        btnGeneral.setBackgroundColor(getResources().getColor(R.color.BackGround));
        liConditionitems.setVisibility(View.GONE);
        btnCondition.setBackgroundColor(getResources().getColor(R.color.white));
        liLineitems.setVisibility(View.GONE);
        btnLineitems.setBackgroundColor(getResources().getColor(R.color.white));
    }
    public void btnCondition(View v){
        liGeneralitems.setVisibility(View.GONE);
        btnGeneral.setBackgroundColor(getResources().getColor(R.color.white));
        liConditionitems.setVisibility(View.VISIBLE);
        btnCondition.setBackgroundColor(getResources().getColor(R.color.BackGround));
        liLineitems.setVisibility(View.GONE);
        btnLineitems.setBackgroundColor(getResources().getColor(R.color.white));
    }
    public void btnLineitems(View v){
        liGeneralitems.setVisibility(View.GONE);
        btnGeneral.setBackgroundColor(getResources().getColor(R.color.white));
        liConditionitems.setVisibility(View.GONE);
        btnCondition.setBackgroundColor(getResources().getColor(R.color.white));
        liLineitems.setVisibility(View.VISIBLE);
        btnLineitems.setBackgroundColor(getResources().getColor(R.color.BackGround));
    }

}
