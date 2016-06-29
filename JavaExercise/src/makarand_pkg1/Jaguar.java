package makarand_pkg1;

public class Jaguar extends Car {
	
	public Jaguar(int max_speed, int max_gears, String make, String model)
	{
		this.max_gears=max_gears;
		this.max_speed=max_speed;
		this.make=make;
		this.model=model;
				
	}

	public static void main(String arg[])
	{
		Jaguar j1=new Jaguar(350,6,"Jaguar","XE");
		j1.show_Model();
		j1.showSpeed();
		
	}
	
}
