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

        phraseList.add(new Word(getString(R.string.where_are_you_going),"minto wuksus", R.raw.phrase_where_are_you_going));
        phraseList.add(new Word(getString(R.string.whats_your_name),"tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        phraseList.add(new Word(getString(R.string.my_name_is),"oyaaset...", R.raw.phrase_my_name_is));
        phraseList.add(new Word(getString(R.string.how_are_you_feeling),"michәksәs?", R.raw.phrase_how_are_you_feeling));
        phraseList.add(new Word(getString(R.string.im_feeling_good),"kuchi achit", R.raw.phrase_im_feeling_good));
        phraseList.add(new Word(getString(R.string.are_you_coming),"әәnәs'aa?", R.raw.phrase_are_you_coming));
        phraseList.add(new Word(getString(R.string.yes_im_coming),"hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        phraseList.add(new Word(getString(R.string.im_coming),"әәnәm", R.raw.phrase_im_coming));
        phraseList.add(new Word(getString(R.string.lets_go),"yoowutis", R.raw.phrase_lets_go));
        phraseList.add(new Word(getString(R.string.come_here),"әnni'nem", R.raw.phrase_come_here));

        WordAdapter phraseAdapter = new WordAdapter(this, phraseList, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(phraseAdapter);

    }
}
