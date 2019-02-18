package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Creating Colors list
        ArrayList<Word> colorsList = new ArrayList<Word>();
        // Populating the Colors list
        colorsList.add(new Word(getString(R.string.red),"weṭeṭṭi"));
        colorsList.add(new Word(getString(R.string.green),"chokokki"));
        colorsList.add(new Word(getString(R.string.brown),"ṭakaakki"));
        colorsList.add(new Word(getString(R.string.gray),"ṭopoppi"));
        colorsList.add(new Word(getString(R.string.black),"kululli"));
        colorsList.add(new Word(getString(R.string.white),"kelelli"));
        colorsList.add(new Word(getString(R.string.dusty_yellow),"ṭopiisә"));
        colorsList.add(new Word(getString(R.string.mustard_yellow),"chiwiiṭә"));

        // Setting the ListView and the WordAdapter
        ListView listView = (ListView) findViewById(R.id.list);
        WordAdapter colorsAdapter = new WordAdapter(this, colorsList);
        listView.setAdapter(colorsAdapter);

    }
}
