package com.example.android.travelfootprintgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    /**
     * Declaring and initializing the variable scores for Traveler A and B
     */
    int scoreTravelerA = 0;
    int scoreTravelerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the traveler A uses a bike +20 points.
     */
    public void add20PointsTravelerA(View view) {
        scoreTravelerA = scoreTravelerA + 20 ;
        displayForTravelerA(scoreTravelerA);
    }

    /**
     * This method is called when the traveler A uses a bus +15 points.
     */
    public void add15PointsTravelerA(View view) {
        scoreTravelerA = scoreTravelerA + 15 ;
        displayForTravelerA(scoreTravelerA);
    }

    /**
     * This method is called when the traveler A uses a electric car +10 points.
     */
    public void add10PointsTravelerA(View view) {
        scoreTravelerA = scoreTravelerA + 10 ;
        displayForTravelerA(scoreTravelerA);
    }

    /**
     * This method is called when the traveler A uses a normal car +5 points.
     */
    public void add5PointsTravelerA(View view) {
        scoreTravelerA = scoreTravelerA + 5 ;
        displayForTravelerA(scoreTravelerA);
    }


    /**
     * This method is called when the traveler B uses a bike +20 points.
     */
    public void add20PointsTravelerB(View view) {
        scoreTravelerB = scoreTravelerB + 20 ;
        displayForTravelerB(scoreTravelerB);
    }

    /**
     * This method is called when the traveler B uses a bus +15 points.
     */
    public void add15PointsTravelerB(View view) {
        scoreTravelerB = scoreTravelerB + 15 ;
        displayForTravelerB(scoreTravelerB);
    }

    /**
     * This method is called when the traveler B uses a electric car +10 points.
     */
    public void add10PointsTravelerB(View view) {
        scoreTravelerB = scoreTravelerB + 10 ;
        displayForTravelerB(scoreTravelerB);
    }

    /**
     * This method is called when the traveler B uses a normal car +5 points.
     */
    public void add5PointsTravelerB(View view) {
        scoreTravelerB = scoreTravelerB + 5 ;
        displayForTravelerB(scoreTravelerB);
    }

    /**
     * This method is called when the game is over and Traveler A and B scores will be zero.
     */
    public void resetScores(View view) {
        scoreTravelerA = 0 ;
        displayForTravelerA(scoreTravelerA);
        scoreTravelerB = 0 ;
        displayForTravelerB(scoreTravelerB);
    }
    /**
     * Displays the given score for Traveler A.
     */
    public void displayForTravelerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.traveler_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Traveler B.
     */
    public void displayForTravelerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.traveler_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This method is for saving data Travelers A and B.
     */
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("scoreTravelerA", scoreTravelerA);
        savedInstanceState.putInt("scoreTravelerB", scoreTravelerB);
    }
    /**
     * This method is for restoring data Traveler A and B.
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState != null) {
            scoreTravelerA = savedInstanceState.getInt("scoreTravelerA");
            scoreTravelerB = savedInstanceState.getInt("scoreTravelerB");
        }
        displayForTravelerA(scoreTravelerA);
        displayForTravelerB(scoreTravelerB);
    }
}
