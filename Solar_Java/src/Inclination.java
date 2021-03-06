import java.util.Calendar;


public class Inclination {
	
	private double declination_angle;
	private double elevation_angle;
	private int dayOfYear;
	private double panel_inclination;
	
	int getDayOfYear() {
		return dayOfYear;
	}

	public double getPanel_inclination(){
		return this.panel_inclination;
	}
	
	double Inclination_Year(double latitude){
		this.panel_inclination=latitude;
		return this.panel_inclination;
	}
	
	double Calcule_panelInclination(double latitude, int day){
		double inclination;
		declination_angle = Math.toRadians(23.45) * (Math.sin(Math.toRadians((360*((dayOfYear-81)/365)))));
		elevation_angle =  Math.asin(Math.sin(declination_angle)*Math.sin(latitude) + Math.cos(declination_angle)*Math.cos(latitude));
		inclination = 90 - Math.toDegrees(elevation_angle);
		return (inclination);
	}
	
	double Inclination_byDay(double latitude, Calendar date){
		latitude = Math.toRadians(latitude);
		this.dayOfYear =  date.get(Calendar.DAY_OF_YEAR);
		this.panel_inclination = Calcule_panelInclination(latitude, dayOfYear);
		return this.panel_inclination;
	}
	
	double Inclination_bySeason(double latitude, String Season){
		int dayStart= 0, dayEnd=0, nday=0;
		double accumulator=0;
		
		if(latitude ==0)
			return(0);
		
		boolean polo = (latitude> 0);
		
		if(Season.equals("Spring")){
			if(polo){
				dayStart = 79;
				dayEnd = 172;
			}
			else{
				dayStart = 266;
				dayEnd = 355;
			}
		}
		else if(Season.equals("Summer")){
			if(polo){
				dayStart = 172;
				dayEnd = 266;
			}
			else{
				dayStart = 355;
				dayEnd = 80;
			}
		}
		else if(Season.equals("Fall")){
			if(polo){
				dayStart = 266;
				dayEnd = 355;
			}
			else{
				dayStart = 81;
				dayEnd = 171;
			}
		}
		else if(Season.equals("Winter")){
			if(polo){
				dayStart = 355;
				dayEnd = 80;
			}
			else{
				dayStart = 172;
				dayEnd = 266;
			}
		}
		
		while(dayStart<=dayEnd)
		{
			accumulator+=Calcule_panelInclination(latitude, dayStart);
			
			nday++;
			dayStart++;
			if(dayStart==366)
			{
				dayStart=1;
			}
		}
		
		this.panel_inclination= accumulator/nday;
		return this.panel_inclination;
	}
	
}
