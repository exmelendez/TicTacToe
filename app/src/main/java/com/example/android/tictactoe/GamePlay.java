package com.example.android.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class GamePlay extends AppCompatActivity {

    TextView a1Letter, b1Letter, c1Letter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_play);

        a1Letter = (TextView) findViewById(R.id.a1_letter);
        a1Letter.setX(158);
        a1Letter.setY(380);

        b1Letter = (TextView) findViewById(R.id.b1_letter);
        b1Letter.setX(615);
        b1Letter.setY(353);

//        c1Letter = (TextView) findViewById(R.id.b1_letter);
//        c1Letter.setX(800);
//        c1Letter.setY(353);

    }
}
