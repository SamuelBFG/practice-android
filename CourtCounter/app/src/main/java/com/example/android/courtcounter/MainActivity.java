package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePoints(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoPoints(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void addOnePoint(View view){
        scoreTeamA ++;
        displayForTeamA(scoreTeamA);
    }
}
