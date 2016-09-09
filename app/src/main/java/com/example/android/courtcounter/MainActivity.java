package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int foulTeamA = 0;
    int yellowTeamA = 0;
    int redTeamA = 0;
    int teamBScore = 0;
    int foulTeamB = 0;
    int yellowTeamB = 0;
    int redTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayForTeamA (int score, String displayType) {
        if (displayType == "score") {
            TextView textView = (TextView) findViewById(R.id.team_a_score);
            textView.setText(String.valueOf(score));
        }
        if (displayType == "foul") {
            TextView textView = (TextView) findViewById(R.id.foul_counter_a);
            textView.setText(String.valueOf(score));
        }
        if (displayType == "yellow") {
            TextView textView = (TextView) findViewById(R.id.yellow_counter_a);
            textView.setText(String.valueOf(score));
        }
        if (displayType == "red") {
            TextView textView = (TextView) findViewById(R.id.red_counter_a);
            textView.setText(String.valueOf(score));
        }
    }


    public void addOneForTeamA (View view) {
        teamAScore++;
        displayForTeamA(teamAScore, "score");
    }

    public void addFoulTeamA (View view) {
        foulTeamA++;
        displayForTeamA(foulTeamA, "foul");
    }

    public void addYellowTeamA (View view) {
        yellowTeamA++;
        displayForTeamA(yellowTeamA, "yellow");
    }

    public void addRedTeamA (View view) {
        redTeamA++;
        displayForTeamA(redTeamA, "red");
    }


    public void displayForTeamB (int score, String displayType) {
        if (displayType == "score") {
            TextView textView = (TextView) findViewById(R.id.team_b_score);
            textView.setText(String.valueOf(score));
        }
        if (displayType == "foul") {
            TextView textView = (TextView) findViewById(R.id.foul_counter_b);
            textView.setText(String.valueOf(score));
        }
        if (displayType == "yellow") {
            TextView textView = (TextView) findViewById(R.id.yellow_counter_b);
            textView.setText(String.valueOf(score));
        }
        if (displayType == "red") {
            TextView textView = (TextView) findViewById(R.id.red_counter_b);
            textView.setText(String.valueOf(score));
        }
    }



    public void addOneForTeamB (View view) {
        teamBScore++;
        displayForTeamB(teamBScore,"score");
    }

    public void addFoulTeamB (View view) {
        foulTeamB++;
        displayForTeamB(foulTeamB, "foul");
    }

    public void addYellowTeamB (View view) {
        yellowTeamB++;
        displayForTeamB(yellowTeamB, "yellow");
    }

    public void addRedTeamB (View view) {
        redTeamB++;
        displayForTeamB(redTeamB, "red");
    }

    public void resetScores (View view){
        teamAScore = teamBScore = 0;
        displayForTeamA(teamAScore, "score");
        displayForTeamA(teamAScore, "foul");
        displayForTeamA(teamAScore, "yellow");
        displayForTeamA(teamAScore, "red");
        displayForTeamB(teamBScore,"score");
        displayForTeamB(teamBScore,"foul");
        displayForTeamB(teamBScore,"yellow");
        displayForTeamB(teamBScore,"red");
    }
}
