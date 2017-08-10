package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    String message;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        if(getIntent().hasExtra("message")) {
            Bundle bundle = getIntent().getExtras();
            message = bundle.getString("message");
        } else {
            message = "No text entered";
        }

        textView = (TextView) findViewById(R.id.text);
        textView.setText(message);
    }
}
