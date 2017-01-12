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
            String fact = "";
            // Randomly select a fact
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(3);
            fact = randomNumber + "";

            // Update the screen with our new dynamic fact
            mFactTextView.setText(fact);
        }
    }
}
