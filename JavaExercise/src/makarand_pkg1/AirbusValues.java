package makarand_pkg1;

public class AirbusValues {
	
	
	public static void main(String ar[])
	{
		
		Airbus a1=new Airbus();
		
		a1.set_weight_in_tons(575);
		a1.set_no_of_engines(4);
		a1.set_max_speed_mph(500);
		a1.set_max_altitude(42651);
		
		System.out.println("The details of Airbus are:\n");
		System.out.println("\nWeight in tons is:"+a1.get_weight_in_tons());
		System.out.println("\nNumber of engines:"+a1.get_no_of_engines());
		System.out.println("\nMaximum altitude:"+a1.get_max_altitude());
		System.out.println("\nMaximum speed in mph is:"+a1.get_max_speed_mph());
		
	}

}

