package com.example.tommy.saferide.activities;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.tommy.saferide.R;
import com.example.tommy.saferide.fragments.LoginFragment;
import com.example.tommy.saferide.fragments.MyMapFragment;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

public class MainActivity extends AppCompatActivity {
    private GoogleApiClient mGoogleApiClient;
    private MyMapFragment mapFrag;
    private final String LOGNAME = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOGNAME, "before fragment manager");
        // Get the fragment manager
        FragmentManager fm = getSupportFragmentManager();

        // Create instance of fragment
        LoginFragment loginFrag = new LoginFragment();

        // Use a fragment transaction to show fragment
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.frag_layout, loginFrag);

        transaction.commit();
        Log.d(LOGNAME, "after fragment transaction");
    }


    public void startMaps() {
        // Get the fragment manager
        FragmentManager fm = getSupportFragmentManager();

        // Create instance of fragment
        mapFrag = new MyMapFragment();

        // Use a fragment transaction to show fragment
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.frag_layout, mapFrag);

        transaction.commit();

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(mapFrag)
                .addOnConnectionFailedListener(mapFrag)
                .addApi(LocationServices.API)
                .build();
    }

    public void loginUser(View view) {
        // Login user
        // if login is validated:
        startMaps();
    }
}
