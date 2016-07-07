package makarand_pkg1;

public class Audi extends Car {
	
	public Audi(int speed, int gears, String car_make, String car_model)
	{
		super(speed, gears, car_make, car_model);
				
	}

	public static void main(String arg[])
	{
		Audi a1=new Audi(300,5,"Audi","R8");
		a1.show_Model();
		a1.showSpeed();
		
	}
	
}
