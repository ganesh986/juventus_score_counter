package com.example.android.juventus_score_counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int juventus = 0;
    int opponents = 0;
    int juventusSubs = 0;
    int opponentsSubs = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Juventus.
     */
    public void displayForJuventus(int score) {
        TextView scoreView = (TextView) findViewById(R.id.current_point_juventus);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Opponents.
     */
    public void displayForOpponents(int score) {
        TextView scoreView = (TextView) findViewById(R.id.current_point_opponents);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given substitution for Juventus.
     */
    public void displaySubsForJuventus(int score) {
        TextView scoreView = (TextView) findViewById(R.id.current_foul_juventus);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given substitution for Opponents.
     */
    public void displaySubsForOpponents(int score) {
        TextView scoreView = (TextView) findViewById(R.id.current_foul_opponents);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Method called when goal button is clicked juventus.
     */
    public void addGoalJuventus(View view) {
        juventus = juventus + 1;
        displayForJuventus(juventus);

    }

    /**
     * Method called when substitution button is clicked juventus.
     */
    public void addSubstitutionJuventus(View view) {
        juventusSubs = juventusSubs + 1;
        if (juventusSubs > 3) {
            Toast.makeText(MainActivity.this,
                    "3 is the max number of substitution", Toast.LENGTH_LONG).show();
            juventusSubs = 3;
            return;
        }
        displaySubsForJuventus(juventusSubs);
    }

    /**
     * Method called when goal button is clicked opponents.
     */
    public void addGoalOpponents(View view) {
        opponents = opponents + 1;
        displayForOpponents(opponents);

    }

    /**
     * Method called when substitution button is clicked opponents.
     */
    public void addSubstitutionOpponents(View view) {
        opponentsSubs = opponentsSubs + 1;
        if (opponentsSubs > 3) {
            Toast.makeText(MainActivity.this,
                    "3 is the max number of substitution", Toast.LENGTH_LONG).show();
            opponentsSubs = 3;
            return;
        }
        displaySubsForOpponents(opponentsSubs);
    }

    /**
     * Method called when reset button is clicked.
     */
    public void resetScore(View view) {
        opponents = 0;
        juventus = 0;
        opponentsSubs = 0;
        juventusSubs = 0;
        displayForJuventus(juventus);
        displaySubsForJuventus(juventusSubs);
        displayForOpponents(opponents);
        displaySubsForOpponents(opponentsSubs);

    }
}
