package com.professordroid.passdatafromactivitytoactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class WelcomeActivity extends AppCompatActivity {

    private TextView textViewWelcomeMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        textViewWelcomeMessage = findViewById(R.id.textViewWelcomeMessage);

        if (getIntent() != null) {
            String data = getIntent().getStringExtra("data");
            textViewWelcomeMessage.setText(
                    String.format(Locale.US, "Hello %s, Good morning!", data));
        }
    }
}
