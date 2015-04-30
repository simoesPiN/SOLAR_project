package com.example.testsolar;

import java.util.Calendar;

public class DeclinationAngle {
	
	double day, latitude;
	
	
	double declination_angle = Math.toRadians(23.45) * (Math.sin(Math.toRadians((360*((day-81)/365)))));
	
	double elevation_angle = Math.asin((Math.sin(declination_angle)*Math.sin(latitude)) + (Math.cos(declination_angle)*Math.cos(latitude)*1));
	
	public static void main (String args []) {
		
		Calendar data = Calendar.getInstance();
	    System.out.println( data.get(Calendar.DAY_OF_YEAR));
	    
	}
	
	

}
