package com.f2o.om.virinchi.f2o.Others;

import android.content.Context;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.f2o.om.virinchi.f2o.App.AppController;
import com.f2o.om.virinchi.f2o.DataBase.DatabaseHandler;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ndroid on 1/5/2017.
 */

public class Others {
    Context _context;
    DatabaseHandler db;
    String url="http://samplewebapi.optionmatrix.org/api/values/SampleDataPost";
    public Others(Context context){
        _context=context;
        db=new DatabaseHandler(context);
        List<String> data=db.getAllPayables();
        for(String names:data){
            Log.v("testing",names);
        }
    }

    public void serverCalMain(){
        List<String> dataNo=db.getPayable("No");
        for(String names:dataNo){
            serverCal(names,url);
        }
    }

    public void serverCal(String text,String url){



        JSONObject obj= new JSONObject();
        try {
            obj.put("vcName",text);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Log.v("url", obj.toString());
        // json object request
        JsonObjectRequest jsObjRequest = new JsonObjectRequest(
                Request.Method.POST, url, obj,
                new Response.Listener<JSONObject>() {
                    // response from json object
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            Log.v("response", response.toString());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            // error handling here
            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO Auto-generated method stub
                Log.i("volley", "error: " + error);

            }
        }) {
            // Passing some request headers
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<>();
                headers.put("Content-Type", "application/json; charset=utf-8");
                return headers;
            }

        };
        // setting the url cache
        jsObjRequest.setShouldCache(false);
        // setting up the retry policy
        jsObjRequest.setRetryPolicy(new DefaultRetryPolicy(30000, 0,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsObjRequest,"testing");
    }

}
