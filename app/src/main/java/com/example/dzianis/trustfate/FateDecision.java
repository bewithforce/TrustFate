package com.example.dzianis.trustfate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class FateDecision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fate_decision);
        TextView textView = findViewById(R.id.Decision);

        try {
            String s = getIntent().getExtras().get("DECISION").toString();

            Integer n = Integer.parseInt(s);
            if (n != 0) {
                String DECISION = "THE FATE MADE HER CHOICE:\n YOU MUST TO DO " + n.toString();
                textView.setText(DECISION);
            } else {
                String DECISION = "RELAX";
                textView.setText(DECISION);
            }
            recreate();

        } catch (Exception e) {
            Log.d("all_is_good", "eeeeeee");
        }
    }
}
