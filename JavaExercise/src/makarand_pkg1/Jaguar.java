package makarand_pkg1;

public class Jaguar extends Car {
	
	public Jaguar(int speed, int gears, String car_make, String car_model)
	{
		super(speed, gears, car_make, car_model);
				
	}

	public static void main(String arg[])
	{
		Jaguar j1=new Jaguar(350,6,"Jaguar","XE");
		j1.show_Model();
		j1.showSpeed();
		
	}
	
}
