package com.example.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputText;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText = (EditText) findViewById(R.id.input);
    }

    public void onSubmit(View view) {
        message = inputText.getText().toString();
        if(message.length()!=0) {
            startActivity(new Intent(this,DetailsActivity.class).putExtra("message",message));
        } else {
            Toast.makeText(this, "Please any message to submit", Toast.LENGTH_SHORT).show();
        }

    }
}
