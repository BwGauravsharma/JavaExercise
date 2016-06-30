package makarand_pkg1;

public class Airbus {
	
	int weight_in_tons, no_of_engines, max_altitude, max_speed_mph;
	
	public void setValues()
	{
		weight_in_tons=575;
		no_of_engines=4;
		max_altitude=42651;
		max_speed_mph=500;
		
	}

	
	public void getValues()
	{
		System.out.println("The details of Airbus are:");
		System.out.println("\nWeight in tons is:"+weight_in_tons);
		System.out.println("\nNumber of engines:"+no_of_engines);
		System.out.println("\nMaximum altitude:"+max_altitude);
		System.out.println("\nMaximum speed in mph is:"+max_speed_mph);
	}

}
