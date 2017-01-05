package com.f2o.om.virinchi.f2o;

import android.content.Intent;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.f2o.om.virinchi.f2o.App.AppController;
import com.f2o.om.virinchi.f2o.App.NetworkStateReceiver;
import com.f2o.om.virinchi.f2o.Others.Others;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

/**
 * Created by Virinchi on 11/24/2016.
 */
public class SplashActivity extends AwesomeSplash implements NetworkStateReceiver.ConnectivityReceiverListener{
    //DO NOT OVERRIDE onCreate()!
    //if you need to start some services do it in initSplash()!

    Others others;
    @Override
    public void initSplash(ConfigSplash configSplash) {

            /* you don't have to override every property */
        others=new Others(SplashActivity.this);
        //Customize Circular Reveal
        configSplash.setBackgroundColor(R.color.BackGround); //any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(2000); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP

        //Choose LOGO OR PATH; if you don't provide String value for path it's logo1 by default

        //Customize logo1
        configSplash.setLogoSplash(R.drawable.logo); //or any other drawable
        configSplash.setAnimLogoSplashDuration(2000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)


        //Customize Path

        configSplash.setOriginalHeight(400); //in relation to your svg (path) resource
        configSplash.setOriginalWidth(400); //in relation to your svg (path) resource
        configSplash.setAnimPathStrokeDrawingDuration(3000);
        configSplash.setPathSplashStrokeSize(3); //I advise value be <5
        configSplash.setPathSplashStrokeColor(R.color.red); //any color you want form colors.xml
        configSplash.setAnimPathFillingDuration(3000);
        configSplash.setPathSplashFillColor(R.color.BackGround); //path object filling color


        //Customize Title
        configSplash.setTitleSplash("Field To Office");
        configSplash.setTitleTextColor(R.color.white);
        configSplash.setTitleTextSize(30f); //float value
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FlipInX);
        checkConnection();
       // configSplash.setTitleFont("fonts/myfont.ttf"); //provide string to your font located in assets/fonts/

    }
    private void checkConnection() {
        boolean isConnected = NetworkStateReceiver.isConnected();
        if(isConnected){
            others.serverCalMain();
        }else {
            Toast.makeText(getApplicationContext(),"offline",Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        AppController.getInstance().setConnectivityListener(this);
    }

    @Override
    public void animationsFinished() {
        Intent i  = new Intent(getApplicationContext() , LoginActivity.class);
        startActivity(i);
        //transit to another activity here
        //or do whatever you want
    }

    @Override
    public void onNetworkConnectionChanged(boolean isConnected) {
        if(isConnected){
            others.serverCalMain();
        }else {
            Toast.makeText(getApplicationContext(),"offline",Toast.LENGTH_SHORT).show();
        }
    }
}
