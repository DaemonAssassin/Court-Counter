package com.mateenmehmood.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//This app is to used for calculates scores of Basketball teams
public class MainActivity extends AppCompatActivity {
    //creating initial Score variable which is zero
    static int scoreTeamA = 0;
    static int scoreTeamB = 0;

    //this method created automatically to make the first activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreTeamA(0);
        displayScoreTeamB(0);
    }

    //This method is to show already value of score
    //displayScore for teamA
    private void displayScoreTeamA(int score) {
        TextView teamScoreA = findViewById(R.id.team_a_score);
        teamScoreA.setText(""+score);
    }
    //This method is to show already value of score
    //displayScore for teamB
    private void displayScoreTeamB(int score) {
        TextView teamScoreB = findViewById(R.id.team_b_score);
        teamScoreB.setText(""+score);
    }

    /*********************** Code for Team A ************************/
    //(Team A) this method is called when we tap on +3 Points Button
    public void addThreePointsToA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayScoreTeamA(scoreTeamA);
    }
    //(Team A) this method is called when we tap on +2 Points Button
    public void addTwoPointsToA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreTeamA(scoreTeamA);
    }
    //(Team A) this method is called when we tap on Free Throw Button
    public void addOnePointToA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
    }
    /*********************** Code for Team B ************************/
    //(Team B) this method is called when we tap on +3 Points Button
    public void addThreePointsToB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayScoreTeamB(scoreTeamB);
    }
    //(Team B) this method is called when we tap on +2 Points Button
    public void addTwoPointsToB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreTeamB(scoreTeamB);
    }
    //(Team B) this method is called when we tap on Free Throw Button
    public void addOnePointToB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
    }
    //this method is called when we tap on reset button.
    public void resetScore(View view) {
        //resetting teamA score
        scoreTeamA = 0;
        displayScoreTeamA(scoreTeamA);
        //resetting teamB score
        scoreTeamB = 0;
        displayScoreTeamB(scoreTeamA);
    }
}