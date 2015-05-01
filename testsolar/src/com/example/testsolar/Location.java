package com.example.testsolar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Location extends ActionBarActivity {
	
	Button FindLocation;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.location);
		
		FindLocation = (Button)findViewById(R.id.bntInitial);
		
		FindLocation.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				mainMenu m = new mainMenu();
				m.setVisible(true);
			}
		});
		
	}
	
	

	}




