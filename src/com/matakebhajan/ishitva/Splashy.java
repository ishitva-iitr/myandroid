package com.matakebhajan.ishitva;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splashy extends Activity {
	MediaPlayer ourSong;

	@Override
	protected void onCreate(Bundle papaGift) {
		// TODO Auto-generated method stub
		super.onCreate(papaGift);
		setContentView(R.layout.splash);

		ourSong = MediaPlayer.create(Splashy.this, R.raw.mainsong);
		ourSong.start();
		Thread timer = new Thread(new Runnable() {
			public void run() {

				try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent openMainActivity = new Intent(Splashy.this,
							MainActivity.class);
					startActivity(openMainActivity);
					finish();
				}

			}

		});
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourSong.release();
		finish();
	}

}
