package com.example.testsolar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Day extends ActionBarActivity {
	
	EditText date;   
	Button calculate, BackMenuDay;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.day);
		
		date = (EditText)findViewById(R.id.editText1);
		calculate = (Button)findViewById(R.id.CalculateDay);
		BackMenuDay = (Button)findViewById(R.id.btnBackDay);
		
		calculate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		BackMenuDay.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				mainMenu m = new mainMenu();
				m.setVisible(true);
								
			}
		});
			
		
	}
	



}
