package com.example.testsolar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class Season_spring extends ActionBarActivity {
	
	TextView ResultSpring;
	Button BackMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season_spring);
		
		ResultSpring =  (Button)findViewById(R.id.btnBackSeasonSpring);
		
		ResultSpring.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Season s =  new Season();
				s.setVisible(true);
				
			}
		});
	}


}
