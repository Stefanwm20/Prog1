package com.stefan.bamo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Thread timer = new Thread() {

			public void run() {

				try {
					sleep(5000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				} finally {
					Intent openMain = new Intent("com.stefan.bamo.MainActivity");
					startActivity(openMain);
				}

			}

		};
		timer.start();

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}
