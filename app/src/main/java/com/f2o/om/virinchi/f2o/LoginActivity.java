package com.f2o.om.virinchi.f2o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
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
 * Created by SaiKrupa on 12/13/2016.
 */

public class LoginActivity extends Activity {

    private EditText inputEmail, inputPassword;
    private Button btnSignUp,btn_check;
    DatabaseHandler db;
    String url="http://samplewebapi.optionmatrix.org/api/values/SampleDataPost";
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
        db=new DatabaseHandler(LoginActivity.this);

        inputEmail = (EditText) findViewById(R.id.input_email);
        inputEmail.clearFocus();
        inputPassword = (EditText) findViewById(R.id.input_password);
        inputPassword.clearFocus();
        btnSignUp = (Button) findViewById(R.id.btn_signup);
        btn_check=(Button)findViewById(R.id.btn_check);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);*/
                String email=inputEmail.getText().toString();
                String isSent;
                i++;
                i=i%2;
                if(i==0)
                    isSent="Yes";
                else
                    isSent="No";

                db.addPayable(email,isSent);
               // sendDataToServer(email);
            }
        });
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> data=db.getAllPayables();
                List<String> dataYes=db.getPayable("Yes");
                List<String> dataNo=db.getPayable("No");
                for(String names:data){
                    Log.v("testing",names);
                }
                for(String names:dataYes){
                    Log.v("testing Yes",names);
                }
                for(String names:dataNo){
                    Log.v("testing No",names);
                }
            }
        });
       // hideKeyboard();
    }
    private void sendDataToServer(String text) {
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
