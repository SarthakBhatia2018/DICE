package com.example.dice;

import android.content.Context;
import android.media.Image;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
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
        Button rollButton   =(Button)    findViewById(R.id.RollButton);
        final ImageView leftDice  =(ImageView) findViewById(R.id.image_LeftDice);
        final ImageView RightDice =(ImageView) findViewById(R.id.image_RightDice);
        final int DiceArray[]={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};
        rollButton.setOnClickListener(new View.OnClickListener() {
            Vibrator vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            @Override
            public void onClick(View v) {
                Log.d("Dice","The button has been pressed");
                Random r1=new Random();
                int number=r1.nextInt(6);
                int number1=r1.nextInt(6);
                Log.d("Dice","The next number is:"+number);
                leftDice.setImageResource(DiceArray[number]);
                RightDice.setImageResource(DiceArray[number1]);
                vibe.vibrate(100);

            }
        });


    }
}
