package com.example.tommy.saferides.models;

import android.location.Location;

import java.sql.Time;

/**
 * Created by tommy on 9/16/2016.
 */
public class Ride {
    private Location mStartLocation;
    private Location mEndLocation;
    private String[] mPeople;
    private int[] mPeopleIDs;

    public Ride() {
        // Default constructor
    }

    public Ride(Location startLocation, Location endLocation, String[] people, int[] peopleIDs) {
        mStartLocation = startLocation;
        mEndLocation = endLocation;
        this.mPeople = people;
        this.mPeopleIDs = peopleIDs;
    }

    public String[] getmPeople() {
        return mPeople;
    }

    public int[] getmPeopleIDs() {
        return mPeopleIDs;
    }

    public Location getmEndLocation() {
        return mEndLocation;
    }

    public Location getmStartLocation() {
        return mStartLocation;
    }
}
