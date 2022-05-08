package com.professordroid.passdatafromactivitytoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.userName);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(v -> {
            Intent welcomeActivity = new Intent(this, WelcomeActivity.class);
            welcomeActivity.putExtra("data", username.getText().toString());
            welcomeActivity.putExtra("intvalue", 1);
            startActivity(welcomeActivity);
        });
    }
}