package com.example.dzianis.trustfate;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Random r = new Random();
        final Intent intent = new Intent(MainActivity.this, FateDecision.class);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.FateButton);
        text = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable editable = text.getText();
                if(editable.length() != 0) {
                    Integer n = Integer.parseInt(editable.toString());
                    n = r.nextInt((1 + n) * 100) / 100;
                    Log.d("all_is_good", n.toString());
                    intent.putExtra("DECISION", n);
                    startActivity(intent);
                }
            }
        });

    }
}