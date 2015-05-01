package com.example.testsolar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class mainMenu extends ActionBarActivity {
	
	Button day, year, season;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		day = (Button)findViewById(R.id.btnDay);
		year = (Button)findViewById(R.id.btnYear);
		season = (Button)findViewById(R.id.btnSeason);
		
		day.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Day d = new Day();
				d.setVisible(true);
				
			}
		});
		
		year.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Year y = new Year();
				y.setVisible(true);
				
			}
		});
		
		season.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Season s = new Season();
				s.setVisible(true);
			}
		});
		
	}


}
