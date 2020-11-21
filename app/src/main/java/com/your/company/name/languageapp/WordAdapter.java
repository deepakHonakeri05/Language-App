package com.your.company.name.languageapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    /*

        whenever we create a class
        A constructor is called first
     */

    /*
        Parameters:
        Context : 'this'
        ArrayList<Words> : our data to this constructor
     */
                                                //context,  resource          ID           data(array)
//    ArrayAdapter arrayAdapter = new ArrayAdapter(this,    R.layout.list_item, R.id.textView, names);

    public WordAdapter(Context context, ArrayList<Word> words)
    {
        super(context,0,words);
        /*
            super() : initialise and calls the parent class constructor
            context : this
            resource : layout
                        '0' because we are tell Android please do not use any pre-defined layout
                            and we are going to give our own layout file
            Words : (data) that we want to display on our screen
         */
    }


    @Override
    /*
        getView : returns a view
        position : eg 0,3,4,5
        currentView (scrapview) : android is going pass it to this function
        parent : listview
     */
    public View getView(int position, View scrapView, ViewGroup parent)
    {

        //recycling the scrap views

        View listItemView = scrapView;
        //populate new views on screen
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            //just to inflate the layout with view
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = listItemView.findViewById(R.id.miwokText);
        TextView englishTextView = listItemView.findViewById(R.id.englishText);
        ImageView imageView = listItemView.findViewById(R.id.imageview);

        miwokTextView.setText(currentWord.getMiwokText());
        englishTextView.setText(currentWord.getEnglishText());
        imageView.setImageResource(currentWord.getImage());

        //sicne we are done recycling we are going return this recycled view to ListView/ android

        return listItemView;
    }

}
