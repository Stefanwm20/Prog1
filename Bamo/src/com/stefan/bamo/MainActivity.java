package com.stefan.bamo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {

	int counter = 0;
	Button add1, add2, add3, clear;
	TextView counterTex;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		add1 = (Button) findViewById(R.id.b10);
		add2 = (Button) findViewById(R.id.b20);
		add3 = (Button) findViewById(R.id.b40);
		clear = (Button) findViewById(R.id.bc);
		counterTex = (TextView) findViewById(R.id.counter);

		add1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				counter += 10;
				counterTex.setText(""+counter);
			}
		});
		add2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				counter += 20;
				counterTex.setText(""+counter);
			}
		});
		add3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				counter += 40;
				counterTex.setText(""+counter);
			}
		});
		clear.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				counter = 0;
				counterTex.setText(""+counter);
			}
		});

	
}
}
