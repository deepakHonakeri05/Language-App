package com.your.company.name.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class numbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> numbers = new ArrayList<Word>();

        numbers.add(new Word("lutti","one", R.drawable.number_one) );
        numbers.add(new Word("otiiko","two", R.drawable.number_two));
        numbers.add(new Word("tolookosu","three", R.drawable.number_three));
        numbers.add(new Word("------","Four", R.drawable.number_four));

        WordAdapter adapter = new WordAdapter(this, numbers);
        ListView simpleList;
        simpleList = findViewById(R.id.listView);
        simpleList.setAdapter(adapter);

        /*
            What we need?

             we need a custom ArrayAdapter class to display 2 TextViews and 1 Image view


        */



        //numbers is an array

        // We can't actually popluate 3 items : 2 textviews and 1 Imageview
        //
        // into arrayAdapter
        // because array adapter class is designed to 'Dynamically' popluate Only one item
        // this a limitation as it can populate one item but 3 items




//        ListView simpleList;
//        String names[] = {"Jane", "Karl","Ali","Ed","Ben","Amy"};
//        // name is an array
//
//        simpleList = findViewById(R.id.listView);
//
//
//        //ArrayAdapter  is going to convert the list of data into views
//        // 'this' java is a keyword and context is 'this' screen
//        // Below piece of code is going make the views ready to poplulate
//
//        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.list_item, R.id.textView, names);
//
//        //since we have the views
//        // we need to 'Display' views on the screen
//        simpleList.setAdapter(arrayAdapter);
    }
}