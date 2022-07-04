package com.example.lab_8;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationView;

public class dad_jokes extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dad_joke);

        Intent intent = getIntent();
        String txt = intent.getStringExtra("Thejoke");
        TextView textView = findViewById(R.id.tv2);
        textView.setText(txt);
    }
}