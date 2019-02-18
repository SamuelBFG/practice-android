package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Creating words List
        ArrayList<Word> words = new ArrayList<Word>();

        // Populating the words List
        words.add(new Word(getString(R.string.one), "lutti"));
        words.add(new Word(getString(R.string.two), "otiiko"));
        words.add(new Word(getString(R.string.three), "tolooksu"));
        words.add(new Word(getString(R.string.four), "oyyisa"));
        words.add(new Word(getString(R.string.five), "massokka"));
        words.add(new Word(getString(R.string.six), "temmokka"));
        words.add(new Word(getString(R.string.seven), "kenekaku"));
        words.add(new Word(getString(R.string.eight), "kawinta"));
        words.add(new Word(getString(R.string.nine), "wo'e"));
        words.add(new Word(getString(R.string.ten), "na'aacha"));


        // Creating a ArrayAdapter instance object
        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout., words);

        // Creating a ListView object to be instantiated to R.id.list
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);



    }
}
