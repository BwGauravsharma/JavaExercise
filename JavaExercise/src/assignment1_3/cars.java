package assignment1_3;

public class cars {
	
	int speed, gears;
	String make,model;
	
	public void display_details ()
	{
		System.out.println("Make of the car: "+make);
		System.out.println("Model of the car: "+model);
	}
	public void display_config_details ()
	{
		
		System.out.println("Top Speed of the car: "+speed);
		System.out.println("Number of gears car have: "+gears);
	}

}
