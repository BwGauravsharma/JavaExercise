package aashay_asg_2;

public class Airbus
{
	int weight_in_tons, no_of_engines, max_altitude, max_speed_mph;
	
	public void setvalues()
	{
	 
	     weight_in_tons = 1000;
		 no_of_engines = 4;
		 max_altitude = 15000;
		 max_speed_mph = 750;
	}
	
	public void getairbus()
	{
		System.out.println("Airbus Specifications: ");
		System.out.println("Weigh of the plane is "+weight_in_tons);
		System.out.println("Number of engines: "+no_of_engines);
		System.out.println("Maximum Altitude:  "+max_altitude);
		System.out.println("Maximum SPedd in MPH:  "+max_speed_mph);
	}
	
}
