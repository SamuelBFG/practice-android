package com.example.android.miwok;

import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    private WordAdapter familyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> familyList = new ArrayList<Word>();

        familyList.add(new Word(getString(R.string.father), "әpә", R.drawable.family_father, R.raw.family_father));
        familyList.add(new Word(getString(R.string.mother), "әṭa", R.drawable.family_mother, R.raw.family_mother));
        familyList.add(new Word(getString(R.string.son), "angsi", R.drawable.family_son, R.raw.family_son));
        familyList.add(new Word(getString(R.string.daughter), "tune", R.drawable.family_daughter, R.raw.family_daughter));
        familyList.add(new Word(getString(R.string.older_brother), "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        familyList.add(new Word(getString(R.string.younger_brother), "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        familyList.add(new Word(getString(R.string.older_sister), "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        familyList.add(new Word(getString(R.string.younger_sister), "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        familyList.add(new Word(getString(R.string.grandmother), "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyList.add(new Word(getString(R.string.grandfather), "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));

        ListView listView = (ListView) findViewById(R.id.list);
        familyAdapter = new WordAdapter(this, familyList, R.color.category_family);
        listView.setAdapter(familyAdapter);
    }

    protected void onStop(){
        super.onStop();
        //familyAdapter.releaseMediaPlayer();
        familyAdapter.mOnAudioFocusChangeListener.onAudioFocusChange(AudioManager.AUDIOFOCUS_LOSS_TRANSIENT);
    }
}
