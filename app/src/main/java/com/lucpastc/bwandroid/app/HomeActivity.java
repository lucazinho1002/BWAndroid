package com.lucpastc.bwandroid.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Esta linha conecta o código Java ao arquivo XML activity_home.xml
        setContentView(R.layout.activity_home);
    }
}