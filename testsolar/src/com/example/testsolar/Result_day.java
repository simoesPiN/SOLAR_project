package com.example.testsolar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Result_day extends ActionBarActivity {
	
	TextView ResultDay;
	Button BackMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result_day);
		
		ResultDay = (TextView)findViewById(R.id.txtResultDay);
		BackMenu = (Button)findViewById(R.id.btnBackDay);
		
		BackMenu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Day d = new Day();
				d.setVisible(true);
				
			}
		});
	
				
	
	}


}
