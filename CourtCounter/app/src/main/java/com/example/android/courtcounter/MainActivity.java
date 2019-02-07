package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoPointsA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void addOnePointA(View view){
        scoreTeamA ++;
        displayForTeamA(scoreTeamA);
    }

    public void addThreePointsB(View view){
        scoreTeamB += 3;
    }

    public void addTwoPointsB(View view){
        scoreTeamB += 2;
    }

    public void addOnePointB(View view){
        scoreTeamB++;
    }
}
