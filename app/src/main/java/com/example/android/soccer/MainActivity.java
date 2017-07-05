package com.example.android.soccer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public int score1=0;
    public int score2=0;
    public int foul1=0;
    public int foul2=0;

    public void foulA(View view)
    {
        score1=score1+1;
        displayForTeamA(score1);
    }
    public void foulB(View view) {
        score2=score2+1;
        displayForTeamB(score2); }
    public void displayForTeamA(int score1) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score1));
    }
    public void displayForTeamB(int score2) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score2));
    }
    public void reset(View view)
    {
        score1=0;
        displayForTeamA(0);
        score2=0;
        displayForTeamB(0);
        foul1=0;
        diplayForTeamA(0);
        foul2=0;
        diplayForTeamB(0);
    }


    public void diplayForTeamA(int foul1) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul1));
    }
    public void diplayForTeamB(int foul2) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul2));
    }
    public void foul(View view){
        foul1=foul1+1;
        diplayForTeamA(foul1);
    }
    public void foule(View view){
        foul2=foul2+1;
        diplayForTeamB(foul2);
    }
}
