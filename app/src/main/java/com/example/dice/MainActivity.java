package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = (Button) findViewById(R.id.roll_button);
        ImageView leftDice = findViewById(R.id.image_leftDice);
        ImageView rightDice = findViewById(R.id.image_rightDice);
        final int dices[] = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6 };



        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Ze button has been pressed!");
                Random rand = new Random();
                int rd = rand.nextInt(6);
                int rd1 = rand.nextInt(6);
                leftDice.setImageResource(dices[rd]);
                rightDice.setImageResource(dices[rd1]);
            }
        });
    }
}