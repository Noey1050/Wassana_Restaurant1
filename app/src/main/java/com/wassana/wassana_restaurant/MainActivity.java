package com.wassana.wassana_restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Explicit
    private UserTable objUserTABLE;
    private FoodTABLE objFoodTABLE;
    private OrderTABLE objOrderTABLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Connected SQLite
        connectedSQLite();
    }   //OnCreate

    private void connectedSQLite() {
        objUserTABLE = new UserTable(this);
        objFoodTABLE = new FoodTABLE(this);
        objOrderTABLE = new OrderTABLE(this);
    }   //ConnectedSQLite
}   //Main Class
