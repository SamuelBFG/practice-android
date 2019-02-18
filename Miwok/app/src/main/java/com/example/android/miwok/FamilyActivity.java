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

        familyList.add(new Word(getString(R.string.father), "әpә", R.drawable.family_father));
        familyList.add(new Word(getString(R.string.mother), "әṭa", R.drawable.family_mother));
        familyList.add(new Word(getString(R.string.son), "angsi", R.drawable.family_son));
        familyList.add(new Word(getString(R.string.daughter), "tune", R.drawable.family_daughter));
        familyList.add(new Word(getString(R.string.older_brother), "taachi", R.drawable.family_older_brother));
        familyList.add(new Word(getString(R.string.younger_brother), "chalitti", R.drawable.family_younger_brother));
        familyList.add(new Word(getString(R.string.older_sister), "teṭe", R.drawable.family_older_sister));
        familyList.add(new Word(getString(R.string.younger_sister), "kolliti", R.drawable.family_younger_sister));
        familyList.add(new Word(getString(R.string.grandmother), "ama", R.drawable.family_grandmother));
        familyList.add(new Word(getString(R.string.grandfather), "paapa", R.drawable.family_grandfather));

        ListView listView = (ListView) findViewById(R.id.list);
        WordAdapter familyAdapter = new WordAdapter(this, familyList);
        listView.setAdapter(familyAdapter);

    }
}
