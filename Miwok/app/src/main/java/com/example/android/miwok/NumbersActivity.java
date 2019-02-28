package com.example.android.miwok;

import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private WordAdapter numbersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Creating words List
        ArrayList<Word> words = new ArrayList<Word>();

        // Populating the words List
        words.add(new Word(getString(R.string.one), "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word(getString(R.string.two), "otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new Word(getString(R.string.three), "tolooksu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word(getString(R.string.four), "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new Word(getString(R.string.five), "massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new Word(getString(R.string.six), "temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new Word(getString(R.string.seven), "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word(getString(R.string.eight), "kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word(getString(R.string.nine), "wo'e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word(getString(R.string.ten), "na'aacha", R.drawable.number_ten, R.raw.number_ten));


        // Using our CUSTOM <Object>Adapter
        numbersAdapter = new WordAdapter(this, words, R.color.category_numbers);

        // Creating a ListView object to be instantiated to R.id.list
        ListView listView = (ListView) findViewById(R.id.list);
        // Setting our custom adapter to the listView
        listView.setAdapter(numbersAdapter);
    }

    protected void onStop(){
        super.onStop();
        //numbersAdapter.releaseMediaPlayer();
        numbersAdapter.mOnAudioFocusChangeListener.onAudioFocusChange(AudioManager.AUDIOFOCUS_LOSS_TRANSIENT);
    }
}
