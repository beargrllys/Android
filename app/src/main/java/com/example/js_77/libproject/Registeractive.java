package com.example.js_77.libproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Registeractive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeractive);

        EditText idText = (EditText) findViewById(R.id.idText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);
        EditText nameText = (EditText) findViewById(R.id.nameText);
        EditText studentnumText = (EditText) findViewById(R.id.studentnumText);

        Button registerButton = (Button) findViewById(R.id.registerbutton);

    }
}
