package assignment1_3;

public class car_details {
	
	public static void main(String args[])
	{
		ass1_3_Jaguar jaguar = new ass1_3_Jaguar(350,6,"Jaguar","F-Type");
		jaguar.display_config_details();
		jaguar.display_details();
		
		ass1_3_Audi audi = new ass1_3_Audi(200,6,"Audi", "R8");
		audi.display_config_details();
		audi.display_details();
	}

}
