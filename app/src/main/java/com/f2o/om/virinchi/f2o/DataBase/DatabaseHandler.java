package com.f2o.om.virinchi.f2o.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ndroid on 12/21/2016.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "FtoO";

    // payable table name
    private static final String TABLE_PAYABLE = "Login";

    // Contacts Table Columns names

    private static final String KEY_FNAME = "firstName";



    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        // table query
        String CREATE_PAYABLE_TABLE = "CREATE TABLE " + TABLE_PAYABLE + "("
                + KEY_FNAME + " TEXT" + ")";

        // execute query
        Log.v("query", CREATE_PAYABLE_TABLE);
        db.execSQL(CREATE_PAYABLE_TABLE);

    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PAYABLE);
        // Create tables again
        onCreate(db);
    }



    // Adding new contact
    public void addPayable(String name) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_FNAME, name); // Contact First Name
        db.insert(TABLE_PAYABLE, null, values);
        db.close(); // Closing database connection
        }

    // Getting All Contacts
    public List<String> getAllPayables() {
        List<String> payerList = new ArrayList<String>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_PAYABLE;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                // Adding contact to list
                payerList.add(cursor.getString(0));
            } while (cursor.moveToNext());
        }

        // return contact list
        return payerList;
    }


    // Getting contacts Count
    public int getContactsCount() {
        String countQuery = "SELECT  * FROM " + TABLE_PAYABLE;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();
        // return count
        return cursor.getCount();
    }

}