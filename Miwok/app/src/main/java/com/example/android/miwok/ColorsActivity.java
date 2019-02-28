package com.example.android.miwok;

import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    private WordAdapter colorsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Creating Colors list
        ArrayList<Word> colorsList = new ArrayList<Word>();
        // Populating the Colors list
        colorsList.add(new Word(getString(R.string.red),"weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        colorsList.add(new Word(getString(R.string.green),"chokokki", R.drawable.color_green, R.raw.color_green));
        colorsList.add(new Word(getString(R.string.brown),"ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        colorsList.add(new Word(getString(R.string.gray),"ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        colorsList.add(new Word(getString(R.string.black),"kululli", R.drawable.color_black, R.raw.color_black));
        colorsList.add(new Word(getString(R.string.white),"kelelli", R.drawable.color_white, R.raw.color_white));
        colorsList.add(new Word(getString(R.string.dusty_yellow),"ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colorsList.add(new Word(getString(R.string.mustard_yellow),"chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        // Setting the ListView and the WordAdapter
        ListView listView = (ListView) findViewById(R.id.list);
        colorsAdapter = new WordAdapter(this, colorsList, R.color.category_colors);
        listView.setAdapter(colorsAdapter);

    }

    protected void onStop(){
        //colorsAdapter.releaseMediaPlayer();
        colorsAdapter.mOnAudioFocusChangeListener.onAudioFocusChange(AudioManager.AUDIOFOCUS_LOSS_TRANSIENT);
        super.onStop();

    }
}
