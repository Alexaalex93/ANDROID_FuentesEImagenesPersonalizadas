package com.example.cice.gatostextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyTextView myTextView = (MyTextView) findViewById(R.id.caja_buhos);

        myTextView.setText("Hijo de una hiena");
    }
}
