package com.sarajensen.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity implements View.OnClickListener {
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    // Declare view variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_fun_facts);

        mShowFactButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // The button was clicked, so update the fact TextView with a new fact
        if (v == mShowFactButton) {
            String fact = mFactBook.getFact();
            int color = mColorWheel.getColor();
            mRelativeLayout.setBackgroundColor(color);
            mShowFactButton.setTextColor(color);

            // Update the screen with our new dynamic fact
            mFactTextView.setText(fact);
        }
    }
}
