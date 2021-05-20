package com.example.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.widget.Button;
import android.widget.EditText;3333

public class MainActivity extends AppCompatActivity {

    EditText etSearch;
    Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etSearch = findViewById(R.id.search_et);
        btnSearch = findViewById(R.id.search_btn);



    }
}