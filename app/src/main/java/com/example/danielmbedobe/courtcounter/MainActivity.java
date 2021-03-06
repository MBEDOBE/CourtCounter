package com.example.danielmbedobe.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //tracks score for team A
    int scoreTeamA = 0;

    //tracks score for team B
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //increase score for team A by 3points for a penalty kick
    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    //increase the score for team A by 3points for a drop goal
    public void addThreePointsForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    //increase score for team A by 2points for a conversion
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    //increase score for team A by 5points for a Try
    public void addOneForTeamA(View view) {
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.teamA_score);
        scoreView.setText(String.valueOf(score));
    }

    //increase score for team B by 3points
    public void addThreeForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    //increase the score for team A by 3points for a drop goal
    public void addThreePointsForTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    //increase score for team B by 2points for a conversion
    public void addTwoForTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    //increase score for team B by 5points for a try
    public void addOneForTeamB(View view) {
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.teamB_score);
        scoreView.setText(String.valueOf(score));
    }

    //reset score for both teams to 0
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


}
