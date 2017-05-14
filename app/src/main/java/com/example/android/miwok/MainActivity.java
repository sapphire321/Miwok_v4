package com.example.android.miwok;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private MediaPlayer mediaPlayer;
    private Button playBtn, pauseBtn, seek;
    private double startTime = 0;
    private double finalTime = 0;
    private int forwardTime = 5000;
    private int backwardTime = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        /**NumbersActivity*/
        //find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        //Set a clickListener on that view
        numbers.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the numbers View is clicked on
            @Override
            public void onClick(View view)
            {//Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });
        /**FamilyActivity*/
        TextView family = (TextView) findViewById(R.id.family);
        //Set a clickListener on that view
        family.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the numbers View is clicked on
            @Override
            public void onClick(View view)
            {//Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
        /**ColorsActivity*/
        TextView colors = (TextView) findViewById(R.id.colors);
        //Set a clickListener on that view
        colors.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the numbers View is clicked on
            @Override
            public void onClick(View view)
            {//Create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });
        /**PhrasesActivity*/
        TextView phrases = (TextView) findViewById(R.id.phrases);
        //Set a clickListener on that view
        phrases.setOnClickListener(new View.OnClickListener(){
            //The code in this method will be executed when the numbers View is clicked on
            @Override
            public void onClick(View view)
            {//Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });


/**ALL TESTS DOWN BELOW
 * MEDIAPLAYER SHIT
 * **/
        playBtn = (Button) findViewById(R.id.playBtn);
        pauseBtn = (Button) findViewById(R.id.pauseBtn);
        seek = (Button) findViewById(R.id.seek);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.nana);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();
                        mediaPlayer.start();

                finalTime = mediaPlayer.getDuration();
                startTime = mediaPlayer.getCurrentPosition();
            }});


        pauseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();
                        mediaPlayer.pause();
            }
        });

        seek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = (int)startTime;

                if((temp-backwardTime)>0){
                    startTime = startTime - backwardTime;
                    mediaPlayer.seekTo((int) startTime);
                    Toast.makeText(getApplicationContext(),"You have Jumped backward 5 seconds",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Cannot jump backward 5 seconds",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
