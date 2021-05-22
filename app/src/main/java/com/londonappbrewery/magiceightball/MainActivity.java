package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView eightBall = findViewById(R.id.imageEightBall);
        final int[] eightBalls = { R.drawable.ball2, R.drawable.ball2, R.drawable.ball3,
            R.drawable.ball4, R.drawable.ball5 };
        Button askbutton = findViewById(R.id.askButton);

        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random numberGenerator = new Random();
                int number = numberGenerator.nextInt(5);
                eightBall.setImageResource(eightBalls[number]);
            }
        });
    }
}
