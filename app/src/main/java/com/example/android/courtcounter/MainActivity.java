package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.displayForTeamA(27);
    }

    protected void resetScores(View view ) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        this.displayForTeamA(scoreTeamA);
        this.displayForTeamB(scoreTeamB);
    }
    protected void threePointer(View view ) {
        scoreTeamA += 3;
        this.displayForTeamA(scoreTeamA);
    }

    protected void twoPointer(View view ) {
        scoreTeamA += 2;
        this.displayForTeamA(scoreTeamA);
    }

    protected void freeThrow(View view ) {
        scoreTeamA += 1;
        this.displayForTeamA(scoreTeamA);
    }

    protected void threePointerB(View view ) {
        scoreTeamB += 3;
        this.displayForTeamB(scoreTeamB);
    }

    protected void twoPointerB(View view ) {
        scoreTeamB += 2;
        this.displayForTeamB(scoreTeamB);
    }

    protected void freeThrowB(View view ) {
        scoreTeamB += 1;
        this.displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
