package com.matakebhajan.ishitva;

import android.app.Activity;
import android.app.ActionBar;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {

	private MediaPlayer mPlayer;
	private int currentSong = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		Intent intent = getIntent();
		int number = intent.getIntExtra("BUTTON NUMBER", 2);
		
		TextView tv = (TextView) findViewById(R.id.textView);
		if (number==1)
		{
        tv.setText("  NOW PLAYING : AAYE MAA JAGADAMBE KE NAVRATRE AAE  ");
		}
		if (number==2)
		{
        tv.setText("  NOW PLAYING : DEKHTE RAHE MERE NAINA  ");
		}
		if (number==3)
		{
        tv.setText("  NOW PLAYING : EK DOLI CHALI  ");
		}
		if (number==4)
		{
        tv.setText("  NOW PLAYING : JAI JWALA  ");
		}
		if (number==5)
		{
        tv.setText("  NOW PLAYING : JHUMO NACHO  JI   ");
		}
		if (number==6)
		{
        tv.setText("  NOW PLAYING : KADAM KADAM PAR SAATH HAI  ");
		}
		if (number==7)
		{
        tv.setText("  NOW PLAYING :  MUJHE MAA SE GILA  ");
		}
		

		if (number == 1) {
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.play1);
			currentSong = R.raw.play1;
		} else if (number == 2) {
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.play2);
			currentSong = R.raw.play2;

		} else if (number == 3) {
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.play3);
			currentSong = R.raw.play3;

		} else if (number == 4) {
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.play4);
			currentSong = R.raw.play4;
		
		}else if (number == 5) {
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.play5);
			currentSong = R.raw.play5;
			
		}else if (number == 6) {
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.play6);
			currentSong = R.raw.play6;

		}else if (number == 7) {
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.play7);
			currentSong = R.raw.play7;

			// Defaults are always a good idea:
		} else {
			mPlayer = MediaPlayer.create(SecondActivity.this, R.raw.play1);
			currentSong = R.raw.play1;

		}

		mPlayer.start();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		if (mPlayer == null) {
			mPlayer = MediaPlayer.create(SecondActivity.this, currentSong);
		}

		mPlayer.start();
	}

	@Override
	protected void onPause() {
		super.onPause();
		if (mPlayer.isPlaying()) {
			mPlayer.pause();
		}
	}

	@Override
	protected void onStop() {
		super.onStop();

		if (mPlayer.isPlaying()) {
			mPlayer.stop();
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}
}
