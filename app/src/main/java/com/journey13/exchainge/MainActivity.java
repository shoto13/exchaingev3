//TASK LIST FOR APP

//TODO: CREATE SINGNUP AND SIGNIN WIREFRAME  -- COMPLETE
//TODO: CREATE MESSAGING INTERFACE WIREFRAME
//TODO: CREATE SETTINS WIREFRAME
//TODO: CREATE USER SEARCH WIREFRAME

//TODO: CREATE LOGIN/SIGNUP FUNCTIONALITY (FIREBASE? - MAKE IT REUSABLE SO IT CAN BE USED WITH IOS)
//TODO: CREATE USER LIST AND ADD AND SEARCH FUNCTIONALITY
//TODO: CREATE MESSAGING FUNCTIONALITY
//TODO: CREATE SETTINGS FUNCTIONALITY



package com.journey13.exchainge;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) this.findViewById(R.id.toolbar);


    }
}