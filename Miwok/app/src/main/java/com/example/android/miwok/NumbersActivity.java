package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Creating words List
        ArrayList<String> words = new ArrayList<String>();

        // Populating the words List
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // Find the LinearLayout rootView and store it in the variable rootView
        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
        // Populate the rootView with multiple TextView wordViews
        for(int i = 0; i < words.size(); i++){
            // Create the view wordView
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            // Add the view as a child to the parent view rootView
            rootView.addView(wordView);
        }



    }
}
