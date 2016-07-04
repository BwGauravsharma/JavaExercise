package assignment1_3;

public class ass1_3_Audi extends cars {
	
	
	
	public ass1_3_Audi(int speed, int gears, String make, String model)
	{
		this.speed = speed;
		this.gears = gears;
		this.make = make;
		this.model = model;
		
	}
	
	public static void main(String args[])
	{
		ass1_3_Audi audi = new ass1_3_Audi(200,6,"Audi", "R8");
		audi.display_config_details();
		audi.display_details();
		
	}
	

}
