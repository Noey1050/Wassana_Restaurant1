package com.wassana.wassana_restaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Pc on 19/10/2559.
 */
public class FoodTABLE {
    //Explicit
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

        public FoodTABLE(Context context){
            objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
            writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
            readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
        }   //Constructor
}   //Main Class
