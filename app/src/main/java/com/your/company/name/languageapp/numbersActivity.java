package com.your.company.name.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class numbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numbers = new ArrayList<Word>();

        numbers.add(new Word("lutti","one", R.drawable.number_one));
        numbers.add(new Word("otiiko","two", R.drawable.number_two));
    }
}