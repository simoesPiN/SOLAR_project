package com.example.testsolar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class Season_fall extends ActionBarActivity {
	
	TextView ResultFall;
	Button BackMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.season_fall);
		
		ResultFall =  (Button)findViewById(R.id.btnBackSeasonFall);
		
		ResultFall.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Season s =  new Season();
				s.setVisible(true);
				
			}
		});
	}


}
