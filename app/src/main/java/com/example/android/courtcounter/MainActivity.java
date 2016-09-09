package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayForTeamA (int score) {
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        textView.setText(String.valueOf(score));
    }


    public void addThreeForTeamA (View view){
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    public void addTwoForTeamA (View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    public void addOneForTeamA (View view) {
        teamAScore++;
        displayForTeamA(teamAScore);
    }


    public void displayForTeamB (int score) {
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        textView.setText(String.valueOf(score));
    }


    public void addThreeForTeamB (View view){
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    public void addTwoForTeamB (View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    public void addOneForTeamB (View view) {
        teamBScore++;
        displayForTeamB(teamBScore);
    }

    public void resetScores (View view){
        teamAScore = teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
