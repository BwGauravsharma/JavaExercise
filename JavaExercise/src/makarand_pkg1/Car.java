package makarand_pkg1;

public class Car {
	
	int max_speed, max_gears;
	String make, model;
	
	public Car(int max_speed, int max_gears, String make, String model)
	{
		this.max_gears=max_gears;
		this.max_speed=max_speed;
		this.make=make;
		this.model=model;
	}
	
	public void show_Model()
	{
		System.out.println("Make is :"+make);
		System.out.println("Model is :"+model);	
	}
	
	
	public void showSpeed()
	{
		System.out.println("Maximum speed:"+max_speed);
		System.out.println("Maximum Gears:"+max_gears);	
	}
	
}
