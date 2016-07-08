package newtestingManasi;

public class AccessAirbus {

	public static void main(String[] args) 
	
	{
		Airbus ab = new Airbus();
		
		ab.setWeight(1500.00);
		ab.setNo_of_engines(3);
		ab.setSpeed(500);
		ab.setAltitude(120);
				
		System.out.println("Weight of Airbus is " +ab.getWeight()  +" tons");
		System.out.println("Altitude of Airbus is " +ab.getAltitude());
		System.out.println("Airbus have " +ab.getNo_of_engines()  +" engines");
		System.out.println("Speed of Airbus is " +ab.getSpeed()  + " KM/hr");
		

	}

}
