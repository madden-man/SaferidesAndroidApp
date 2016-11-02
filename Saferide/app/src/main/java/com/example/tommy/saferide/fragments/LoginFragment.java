package com.example.tommy.saferide.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.tommy.saferide.R;
import com.example.tommy.saferide.activities.MainActivity;

/**
 * Saferides: Created by Tommy Madden on 11/1/2016
 */
public class LoginFragment extends Fragment {
    private EditText studentIdText;
    private EditText passwordText;

    public LoginFragment() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_login, container, false);
        studentIdText = (EditText) view.findViewById(R.id.student_id);
        passwordText = (EditText)view.findViewById(R.id.password);
        return view;
    }
}
