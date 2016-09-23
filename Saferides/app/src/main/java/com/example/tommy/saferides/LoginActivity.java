package com.example.tommy.saferides;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText studentID;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        studentID = (EditText) findViewById(R.id.studentID);
        password = (EditText) findViewById(R.id.password);
    }

    public void loginUser(View view) {
        // Check ID/password with school database
        finish();       // Head back to Maps Activity
    }

    @Override
    protected void onDestroy() {
        // Store values for login and password

        super.onDestroy();
        startActivity(new Intent(this, MapsActivity.class));
    }
}
