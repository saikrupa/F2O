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

import com.f2o.om.virinchi.f2o.DataBase.DatabaseHandler;

import java.util.List;

/**
 * Created by SaiKrupa on 12/13/2016.
 */

public class LoginActivity extends Activity {

    private EditText inputEmail, inputPassword;
    private Button btnSignUp,btn_check;
    DatabaseHandler db;


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
                db.addPayable(email);
            }
        });
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> data=db.getAllPayables();
                for(String names:data){
                    Log.v("testing",names);
                }
            }
        });
       // hideKeyboard();
    }
    private void hideKeyboard() {
        View view = getCurrentFocus();
        if (view != null) {
            ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE)).
                    hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }
}
