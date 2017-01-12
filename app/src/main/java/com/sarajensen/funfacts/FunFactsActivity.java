package com.sarajensen.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity implements View.OnClickListener {
    // Declare view variables
    private TextView mFactTextView;
    private Button mShowFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);

        mShowFactButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        // The button was clicked, so update the fact TextView with a new fact
        if (v == mShowFactButton) {
            String[] facts = {
                    "Ants stretch when they wake up in the morning.",
                    "Ostriches can run faster than horses.",
                    "Olympic gold medals are actually made mostly of silver.",
                    "You are born with 300 bones; by the time you are an adult you will have 206.",
                    "It takes about 8 minutes for light from the Sun to reach Earth.",
                    "Some bamboo plants can grow almost a meter in just one day.",
                    "The state of Florida is bigger than England.",
                    "Some penguins can leap 2-3 meters out of the water.",
                    "On average, it takes 66 days to form a new habit.",
                    "Mammoths still walked the earth when the Great Pyramid was being built." };

            String fact = "";
            // Randomly select a fact
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(facts.length);
            fact = facts[randomNumber];

            // Update the screen with our new dynamic fact
            mFactTextView.setText(fact);
        }
    }
}
