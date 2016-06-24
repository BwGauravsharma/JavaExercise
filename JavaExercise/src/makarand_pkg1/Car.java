package makarand_pkg1;

public class Car {
	
	int max_speed, max_gears;
	String make, model;
	
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
