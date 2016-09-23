package com.example.tommy.saferides.views;

import android.content.Context;
import android.view.ViewGroup;

/**
 * Created by tommy on 9/16/2016.
 */
public class MenuToggler extends ViewGroup {
    private boolean isOpen;

    public MenuToggler(Context context) {
        super(context);
        isOpen = false;
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}
