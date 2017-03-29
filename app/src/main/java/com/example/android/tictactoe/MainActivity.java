package com.example.android.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button strtGame;
    Switch numOfPlayers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strtGame = (Button) findViewById(R.id.start_game_btn);
        numOfPlayers = (Switch) findViewById(R.id.num_of_players_switch);

        switchClick();

    }

    void switchClick() {

        numOfPlayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numOfPlayers.isChecked()) {

                    numOfPlayers.setText("1");

                } else {

                    numOfPlayers.setText("2");

                }

            }
        });

    }

    void playGameClick() {

        strtGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click Play Game", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
