package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> phraseList = new ArrayList<Word>();

        phraseList.add(new Word(getString(R.string.where_are_you_going),"minto wuksus"));
        phraseList.add(new Word(getString(R.string.whats_your_name),"tinnә oyaase'nә"));
        phraseList.add(new Word(getString(R.string.my_name_is),"oyaaset..."));
        phraseList.add(new Word(getString(R.string.how_are_you_feeling),"michәksәs?"));
        phraseList.add(new Word(getString(R.string.im_feeling_good),"kuchi achit"));
        phraseList.add(new Word(getString(R.string.are_you_coming),"әәnәs'aa?"));
        phraseList.add(new Word(getString(R.string.yes_im_coming),"hәә’ әәnәm"));
        phraseList.add(new Word(getString(R.string.im_coming),"әәnәm"));
        phraseList.add(new Word(getString(R.string.lets_go),"yoowutis"));
        phraseList.add(new Word(getString(R.string.come_here),"әnni'nem"));

        WordAdapter phraseAdapter = new WordAdapter(this, phraseList, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(phraseAdapter);

    }
}
