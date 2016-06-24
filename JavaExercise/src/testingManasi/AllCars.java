package testingManasi;

public class AllCars {

	public static void main(String[] args) 
	{
		
		Jaguar ja = new Jaguar(220,6,"j10");
		Jaguar ja1 = new Jaguar("j20");
		ja.displayCar();
		ja1.displayModel();
		
		Audi au  = new Audi (350,7,"a4");
		au.displayCar();
		

	}

}
