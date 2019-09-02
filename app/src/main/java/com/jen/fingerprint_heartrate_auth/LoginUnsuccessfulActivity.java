package com.jen.fingerprint_heartrate_auth;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class LoginUnsuccessfulActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_unsuccessful);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = findViewById(R.id.title_login_unsuccessful);
        Bundle b = getIntent().getExtras();

        String bpm = b.getString("bpm");
        textView.setText("Seus batimentos foram: " + bpm);
    }
}
