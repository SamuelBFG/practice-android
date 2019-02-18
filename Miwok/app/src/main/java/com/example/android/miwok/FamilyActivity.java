package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> familyList = new ArrayList<Word>();

        familyList.add(new Word(getString(R.string.father), "әpә"));
        familyList.add(new Word(getString(R.string.mother), "әṭa"));
        familyList.add(new Word(getString(R.string.son), "angsi"));
        familyList.add(new Word(getString(R.string.daughter), "tune"));
        familyList.add(new Word(getString(R.string.older_brother), "taachi"));
        familyList.add(new Word(getString(R.string.younger_brother), "chalitti"));
        familyList.add(new Word(getString(R.string.older_sister), "teṭe"));
        familyList.add(new Word(getString(R.string.younger_sister), "kolliti"));
        familyList.add(new Word(getString(R.string.grandmother), "ama"));
        familyList.add(new Word(getString(R.string.grandfather), "paapa"));

        ListView listView = (ListView) findViewById(R.id.list);
        WordAdapter familyAdapter = new WordAdapter(this, familyList);
        listView.setAdapter(familyAdapter);

    }
}
