package makarand_pkg1;

public class Audi extends Car {
	
	public Audi(int max_speed, int max_gears, String make, String model)
	{
		this.max_gears=max_gears;
		this.max_speed=max_speed;
		this.make=make;
		this.model=model;
				
	}

	public static void main(String arg[])
	{
		Audi a1=new Audi(300,5,"Audi","R8");
		a1.show_Model();
		a1.showSpeed();
		
	}
	
}
