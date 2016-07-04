package assignment1_3;

public class ass1_3_Jaguar extends cars {
	
	public ass1_3_Jaguar (int speed, int gears, String make, String model)
	{
		this.speed= speed;
		this.gears = gears;
		this.make = make;
		this.model = model;
	}
	
	public static void main (String args[])
	{
		ass1_3_Jaguar jaguar = new ass1_3_Jaguar(350,6,"Jaguar","F-Type");
		jaguar.display_config_details();
		jaguar.display_details();
	}
	

}
